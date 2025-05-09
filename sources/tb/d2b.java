package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.scc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d2b implements w9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17521a;
    public final List<scc.a> b = new CopyOnWriteArrayList();
    public String c;

    static {
        t2o.a(456130665);
        t2o.a(456130606);
    }

    public d2b(String str) {
        this.f17521a = str;
    }

    @Override // tb.w9b
    public void a(scc.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f7de36", new Object[]{this, aVar, str});
            return;
        }
        this.c = str;
        ((CopyOnWriteArrayList) this.b).add(aVar);
    }

    @Override // tb.w9b
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669622ff", new Object[]{this, str})).booleanValue();
        }
        boolean equals = TextUtils.equals(this.f17521a, str);
        TLog.loge("edition_switch", "HomeNewBarVersionServiceImpl", "isSpecifyABTest: " + equals + " ,type: " + str + " ,mNewBarVersion: " + this.f17521a);
        return equals;
    }

    @Override // tb.w9b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470c164d", new Object[]{this, str});
            return;
        }
        TLog.loge("edition_switch", "HomeNewBarVersionServiceImpl", "updateNewBarVersion newBarVersion: " + str);
        if (TextUtils.equals(str, this.f17521a)) {
            TLog.loge("edition_switch", "HomeNewBarVersionServiceImpl", "updateEdlpABInfo abTestInfo 一致不更新 ");
            return;
        }
        this.f17521a = str;
        d(str);
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("336ecb0b", new Object[]{this, str});
        } else if (!((CopyOnWriteArrayList) this.b).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((scc.a) it.next()).onChanged(TextUtils.equals(this.c, str), this.c);
            }
        }
    }
}
