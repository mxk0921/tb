package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tdh implements fnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28647a = akt.p2("enableRVLog", true);

    static {
        t2o.a(502267916);
        t2o.a(503316589);
    }

    @Override // tb.fnc
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2eedcd", new Object[]{this, str, str2});
        } else if (this.f28647a) {
            lcn.f(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }

    @Override // tb.fnc
    public void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
        } else if (this.f28647a) {
            lcn.f(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }

    @Override // tb.fnc
    public void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
        } else if (this.f28647a) {
            lcn.f(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, "error： " + str2);
        }
    }

    @Override // tb.fnc
    public void logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{this, str, str2});
        } else if (this.f28647a) {
            lcn.f(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }

    @Override // tb.fnc
    public void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{this, str, str2});
        } else if (this.f28647a) {
            lcn.f(RVLLevel.Error, str, str2);
        } else {
            TLog.loge("TNode", str, str2);
        }
    }
}
