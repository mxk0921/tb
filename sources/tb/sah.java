package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.index.b;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sah implements uec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f27904a;

    public sah(cgd cgdVar) {
        this.f27904a = cgdVar;
    }

    @Override // tb.uec
    public void b(List<SoIndexData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0d1a1", new Object[]{this, list});
        }
    }

    @Override // tb.uec
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa69232", new Object[]{this, soIndexData, soIndexAdvanced});
        } else if (this.f27904a.a("key_localization_disabled", false)) {
            RSoLog.d("LocalizationIndexDataHook, remote config disabled , skip Localization");
        } else if (Localization.n()) {
            RSoLog.d("LocalizationIndexDataHook, cn site , skip Localization");
        } else {
            String d = this.f27904a.d("key_localization_black_libs", "artc_engine,themis_gfx,fcanvas_v8_jsi");
            if (trq.c(d)) {
                RSoLog.d("LocalizationIndexDataHook, blackLibs is empty, skip Localization");
                return;
            }
            for (Map.Entry<String, SoInfo2> entry : soIndexAdvanced.getInfoMap().entrySet()) {
                String c = b.c(entry.getKey());
                if (trq.c(c)) {
                    RSoLog.g("LocalizationIndexDataHook, libName is empty, wtf !!!, skip Localization, " + entry.getKey());
                } else if (d.contains(c)) {
                    entry.getValue().ext.allowPreFetch = false;
                    RSoLog.d("LocalizationIndexDataHook, disable prefetch for " + c);
                }
            }
        }
    }
}
