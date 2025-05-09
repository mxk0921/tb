package tb;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class f0o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ADDED = 2;
    public static final int STATE_FAILED = -1;
    public static final int STATE_INIT = 0;
    public static final int STATE_PENDING = 1;
    public static final int STATE_SUCCESS = 3;
    public static final int STATE_TIMEOUT = 4;
    private static final String TAG = "RenderInterceptProxy";
    private Object args;
    public final TNodeView container;
    private a listener;
    public int state = 0;
    public final Uri uri;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(503316957);
    }

    public f0o(TNodeView tNodeView, Uri uri) {
        this.container = tNodeView;
        this.uri = uri;
    }

    public Object getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2d143a18", new Object[]{this});
        }
        return this.args;
    }

    public abstract String getRenderPageId();

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.state;
    }

    public void registerRenderStateChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d36df0", new Object[]{this, aVar});
        }
    }

    public abstract void startRender();

    public void setState(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca17c209", new Object[]{this, new Integer(i), obj});
            return;
        }
        this.state = i;
        this.args = obj;
        if (i == 2) {
            this.container.addUpperView((View) obj, new FrameLayout.LayoutParams(-1, -1), 60, null);
        } else if (i == 4) {
            this.container.removeUpperView((View) obj);
        }
        tfs.g(TAG, "setState: " + i + " args: " + obj);
    }
}
