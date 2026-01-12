import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class RecommendationSystem {

    public static void main(String[] args) {

        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

        try {
            DataModel model = new FileDataModel(new File("data/ratings.csv"));

            UserSimilarity similarity =
                    new PearsonCorrelationSimilarity(model);

            UserNeighborhood neighborhood =
                    new NearestNUserNeighborhood(2, similarity, model);

            Recommender recommender =
                    new GenericUserBasedRecommender(
                            model, neighborhood, similarity);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter User ID: ");
            long userId = sc.nextLong();

            System.out.print("Enter number of recommendations: ");
            int count = sc.nextInt();

            List<RecommendedItem> recommendations =
                    recommender.recommend(userId, count);

            System.out.println("\nRecommended items for User " + userId + ":");

            if (recommendations.isEmpty()) {
                System.out.println("No recommendations available.");
            }

            for (RecommendedItem item : recommendations) {
                System.out.println(
                        "Item ID: " + item.getItemID() +
                        " | Score: " + item.getValue());
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
