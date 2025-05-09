package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface xpd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, AbstractC1101a> f31515a = new ConcurrentHashMap();

        /* compiled from: Taobao */
        /* renamed from: tb.xpd$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface AbstractC1101a {
            void c();
        }

        static {
            t2o.a(766509127);
        }

        public AbstractC1101a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AbstractC1101a) ipChange.ipc$dispatch("ab87599", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            return (AbstractC1101a) ((ConcurrentHashMap) this.f31515a).get(str);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf354a81", new Object[]{this});
                return;
            }
            for (AbstractC1101a aVar : ((ConcurrentHashMap) this.f31515a).values()) {
                try {
                    aVar.c();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public void c(String str, AbstractC1101a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c0dc7f", new Object[]{this, str, aVar});
            } else if (str != null && aVar != null) {
                ((ConcurrentHashMap) this.f31515a).put(str, aVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b extends a.AbstractC1101a {
        void d(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        public static final String EVENT_ON_ERROR = "onError";
        public static final String EVENT_ON_FINISH = "onFinish";
        public static final String EVENT_ON_HIDE_BAR = "onHideContainerBar";
        public static final String EVENT_ON_MESSAGE = "onMessage";
        public static final String EVENT_ON_MUTE_STATUS_CHANGED = "onMuteStatusChanged";
        public static final String EVENT_ON_PAUSE = "onPause";
        public static final String EVENT_ON_PLAY = "onPlay";
        public static final String EVENT_ON_SCROLL_DISABLE = "onScrollDisable";
        public static final String EVENT_ON_SCROLL_ENABLE = "onScrollEnable";
        public static final String EVENT_ON_SHOW_BAR = "onShowContainerBar";
        public static final String EVENT_UT_PAGE_APPEAR = "utPageAppear";
        public static final String EVENT_UT_PAGE_DIS_APPEAR = "utPageDisappear";

        void p(String str, JSONObject jSONObject);
    }

    void didAppear();

    void didDisappear();

    void endAnimation();

    ShareContent getShareContent();

    String getUTPageName();

    Map<String, String> getUTProperties();

    View getView();

    void initWithData(Context context, JSONObject jSONObject, c cVar, a aVar);

    void mute(boolean z);

    void onActivityPause();

    void onActivityResume();

    void onActivityStop();

    void onDestroyed();

    void onPageStable();

    void pause();

    void play();

    void startAnimation();

    void willAppear();

    void willDisappear();
}
