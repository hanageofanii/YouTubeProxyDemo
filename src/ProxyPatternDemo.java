public class ProxyPatternDemo {
    public static void main(String[] args) {
        YouTubeService proxyYouTubeService = new ProxyYouTubeService();
        proxyYouTubeService.playVideo("123");
        proxyYouTubeService.playVideo("123");
    }
}
