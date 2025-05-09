package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.b;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public vcd f22095a;

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66373902", new Object[]{this, context});
            return;
        }
        vcd vcdVar = this.f22095a;
        if (vcdVar == null) {
            TLog.loge("AliNewDetailExtend", "PreLoadWeexManager", "preLoadWeexInstance preLoadWeexInstance is null!");
        } else {
            ((b) vcdVar).d(context);
        }
    }

    public void c(vcd vcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44b6b0b", new Object[]{this, vcdVar});
        } else {
            this.f22095a = vcdVar;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbe9ac15", new Object[]{this})).booleanValue();
        }
        vcd vcdVar = this.f22095a;
        if (vcdVar != null) {
            return ((b) vcdVar).c();
        }
        TLog.loge("AliNewDetailExtend", "PreLoadWeexManager", "preLoadWeexInstance preLoadWeexInstance is null!");
        return false;
    }
}
