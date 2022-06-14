public class Vuln{
    private void renderState(FacesContext context) throws IOException {
       if (null != window) {
           String clientWindowId = Util.getClientWindowId(context);
           writer.startUpdate(clientWindowId);
           writer.write(window.getId());
           writer.writeText(window.getId(), null);
           writer.endUpdate();
       }
   }
}
