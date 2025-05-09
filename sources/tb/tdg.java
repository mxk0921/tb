package tb;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class tdg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isAlive = true;
    public Context mContext;
    public ajc mWebView;
    public Object paramObj;

    static {
        t2o.a(507510794);
    }

    public abstract boolean execute(String str, String str2, vdg vdgVar);

    public boolean executeSafe(String str, String str2, vdg vdgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4320199b", new Object[]{this, str, str2, vdgVar})).booleanValue();
        }
        try {
            return execute(str, str2, vdgVar);
        } catch (Throwable th) {
            keg.d(6, "LVJsBridge", Log.getStackTraceString(th));
            return false;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.mContext;
        if (context instanceof MutableContextWrapper) {
            return ((MutableContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public void initialize(Context context, ajc ajcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5512e3aa", new Object[]{this, context, ajcVar});
            return;
        }
        this.mContext = context;
        this.mWebView = ajcVar;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.isAlive = false;
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.isAlive = false;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.isAlive = true;
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void initialize(Context context, ajc ajcVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8fd06", new Object[]{this, context, ajcVar, obj});
            return;
        }
        initialize(context, ajcVar);
        this.paramObj = obj;
    }

    public void initialize(Context context, ajc ajcVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f073150", new Object[]{this, context, ajcVar, obj, str});
        } else {
            initialize(context, ajcVar, obj);
        }
    }
}
