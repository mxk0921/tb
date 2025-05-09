package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.util.MessageTabNavProcessor;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k1i implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<xnj> f22343a;

    static {
        t2o.a(578814100);
        t2o.a(578814049);
    }

    public k1i() {
        ArrayList arrayList = new ArrayList();
        this.f22343a = arrayList;
        try {
            arrayList.add(new MessageTabNavProcessor());
        } catch (Throwable th) {
            TLog.loge("MainTabRedirectProcessor", "construction error", th);
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "MainTabRedirectProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        String str;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        intent.setData(Uri.parse("http://m.taobao.com/index.htm"));
        Iterator it = ((ArrayList) this.f22343a).iterator();
        while (it.hasNext()) {
            xnj xnjVar = (xnj) it.next();
            try {
                str = xnjVar.name();
            } catch (Throwable th2) {
                th = th2;
                str = null;
            }
            try {
                if (xnjVar.skip()) {
                    TLog.loge("MainTabRedirectProcessor", str + " skip");
                } else if (!xnjVar.process(intent, zmjVar)) {
                    TLog.loge("MainTabRedirectProcessor", str + " process blocked");
                    return false;
                } else {
                    continue;
                }
            } catch (Throwable th3) {
                th = th3;
                TLog.loge("MainTabRedirectProcessor", "process error. processorName: " + str, th);
            }
        }
        return true;
    }
}
