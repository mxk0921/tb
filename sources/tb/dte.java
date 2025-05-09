package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dte implements uec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f18053a = new AtomicBoolean(false);
    public final List<uec> b;

    public dte(uec... uecVarArr) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(Arrays.asList(uecVarArr));
    }

    @Override // tb.uec
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa69232", new Object[]{this, soIndexData, soIndexAdvanced});
        } else if (this.f18053a.compareAndSet(false, true)) {
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                uec uecVar = (uec) it.next();
                try {
                    uecVar.a(soIndexData, soIndexAdvanced);
                } catch (Throwable th) {
                    rbn.f("IndexDataHookWrapper.hook error", uecVar.getClass().getSimpleName(), th);
                }
            }
        }
    }

    @Override // tb.uec
    public void b(List<SoIndexData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0d1a1", new Object[]{this, list});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            uec uecVar = (uec) it.next();
            try {
                uecVar.b(list);
            } catch (Throwable th) {
                rbn.f("IndexDataHookWrapper.hookLastCache error", uecVar.getClass().getSimpleName(), th);
            }
        }
    }
}
