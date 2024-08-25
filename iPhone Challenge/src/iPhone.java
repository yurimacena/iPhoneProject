import Features.MusicPlayer;
import Features.TelephoneDevice;
import Features.WebBrowser;

public class iPhone {
    private final MusicPlayer musicPlayer;
    private final TelephoneDevice phone;
    private final WebBrowser webBrowser;

    public iPhone(MusicPlayer musicPlayer, TelephoneDevice phone, WebBrowser webBrowser) {
        this.musicPlayer = musicPlayer;
        this.phone = phone;
        this.webBrowser = webBrowser;
    }

    public void useFeature(String feature, String action) {
        switch (feature) {
            case "music":
                if (action.equals("click ipod")) {
                    musicPlayer.playMusic();
                } else if (action.equals("stop music")) {
                    musicPlayer.stopMusic();
                }
                break;
            case "call":
                if (action.equals("click telephone")) {
                    phone.makeCall();
                } else if (action.equals("stop call")) {
                    phone.endCall();
                }
                    break;
            case "web":
                webBrowser.openPage();
                if (action.equals("click safari")) {
                    webBrowser.openPage();
                } else if (action.equals("close safari")) {
                    webBrowser.closePage();
                }
                    break;
            default:
                System.out.println("Unknown feature.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to iPhone!\n");

        MusicPlayer musicPlayer = new MusicPlayer();
        TelephoneDevice phone = new TelephoneDevice();
        WebBrowser webBrowser = new WebBrowser();

        iPhone iPhone = new iPhone(musicPlayer, phone, webBrowser);

        iPhone.useFeature("music", "click ipod");
        iPhone.useFeature("music", "stop music");

        System.out.println("");

        iPhone.useFeature("call", "click telephone");
        iPhone.useFeature("call", "stop call");

        System.out.println("");
        
        iPhone.useFeature("web", "click safari");
        iPhone.useFeature("web", "close safari");
    }
}
