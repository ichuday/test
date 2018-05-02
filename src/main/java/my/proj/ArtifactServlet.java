package my.proj;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ArtifactServlet", value = "/home/support/Ad-eff/src/main/java/my/proj")
public class ArtifactServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    StarterPipeline.run();
  }
}
