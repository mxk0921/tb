package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class n3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593322);
    }

    public void addExposureViewToCommit(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e457d457", new Object[]{this, str, str2, str3, str4, map});
        }
    }

    public void beginEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
        }
    }

    public void beginScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3d8d51", new Object[]{this, str, map});
        }
    }

    public void endEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
        }
    }

    public void endScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e3f03", new Object[]{this, str, map});
        }
    }

    public int[] getAttentionEventIdsForSendEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ec81ea0e", new Object[]{this});
        }
        return null;
    }

    public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
        }
    }

    public void pageDisAppear(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
        }
    }

    public void pageDisAppearEnd(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6fd959", new Object[]{this, uTTracker, obj, map});
        }
    }

    public void send(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
        }
    }

    public void sendEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602af6ec", new Object[]{this, map});
        }
    }

    public void sessionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
        }
    }

    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
        }
    }

    public abstract String trackerListenerName();

    public void updateEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
        }
    }

    public void updateEventPageName(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
        }
    }

    public void updateNextPageProperties(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b15c54c", new Object[]{this, uTTracker, map});
        }
    }

    public void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
        }
    }

    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
        }
    }

    public void updatePageProperties(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74df5d", new Object[]{this, uTTracker, obj, map});
        }
    }

    public void updatePagePropertiesEnd(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c913703", new Object[]{this, uTTracker, obj});
        }
    }

    public void updatePageStatus(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8add622d", new Object[]{this, obj});
        }
    }

    public void updatePageUrl(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a674c04", new Object[]{this, obj, str});
        }
    }

    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
        }
    }

    public void updateScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
        }
    }

    public void viewBecomeVisible(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7619ab", new Object[]{this, str, str2, str3});
        }
    }
}
