public class ProxyYouTubeService implements YouTubeService {
    private RealYouTubeService realYouTubeService;
    private String cachedVideoId;

    public ProxyYouTubeService() {
        this.realYouTubeService = new RealYouTubeService();
    }

    public void playVideo(String videoId) {
        if (cachedVideoId == null || !cachedVideoId.equals(videoId)) {
            cachedVideoId = videoId;
            realYouTubeService.playVideo(videoId);
        } else {
            System.out.println("Playing cached video: " + videoId);
        }
    }
}
