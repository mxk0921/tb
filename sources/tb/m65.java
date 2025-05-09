package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m65 extends k65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(455082019);
    }

    public static /* synthetic */ Object ipc$super(m65 m65Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/manager/DTDinamicXManager");
    }

    @Override // tb.k65
    public void a(gpb gpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0faac", new Object[]{this, gpbVar});
        }
    }

    @Override // tb.k65
    public Map<String, String> getExposureViewProperties(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21fe9e1", new Object[]{this, str, view});
        }
        return null;
    }

    @Override // tb.k65
    public vp8 getExposureViewTag(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vp8) ipChange.ipc$dispatch("77c81b6a", new Object[]{this, str, view});
        }
        return null;
    }

    @Override // tb.k65
    public boolean isExposureView(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec7c8cf", new Object[]{this, str, view})).booleanValue();
        }
        return false;
    }
}
