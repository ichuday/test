package my.proj;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ArtifactServlet", value = "/home/support/Ad-eff")
public class ArtifactServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    StarterPipeline.run();
  }
}
