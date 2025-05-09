package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l2b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, erb> f23065a = new HashMap();

    static {
        t2o.a(729808988);
    }

    public erb a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (erb) ipChange.ipc$dispatch("e9775619", new Object[]{this, str});
        }
        return rx8.a(str, this.f23065a);
    }

    public void b(String str, ChangeContainerProcess.ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c662a60", new Object[]{this, str, changeContainerType});
        } else if (changeContainerType == ChangeContainerProcess.ChangeContainerType.overseaHotRevision) {
            yyj.e().C();
        } else if (!vxl.b().v() || changeContainerType != ChangeContainerProcess.ChangeContainerType.revision) {
            yyj.e().z();
        }
    }
}
