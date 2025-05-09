package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.component.userMotion")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mo extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public nbb f;
    public UserMotionConfig g;
    public JSONObject h;
    public fsv i;

    static {
        t2o.a(81789214);
    }

    public static /* synthetic */ Object ipc$super(mo moVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else if (hashCode == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/userMotion/extension/impl/AURAUserMotionAspectLifecycleExtension");
        }
    }

    public final void P0(AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd2953", new Object[]{this, aURAInputData});
            return;
        }
        Serializable data = aURAInputData.getData();
        if (data instanceof AURAEventIO) {
            AURAEventIO aURAEventIO = (AURAEventIO) data;
            AURARenderComponent j = aURAEventIO.getEventModel().j();
            String eventType = aURAEventIO.getEventType();
            if (!TextUtils.equals(eventType, "user_track") && !TextUtils.equals(eventType, "userTrack")) {
                isv.b(this.f, this.g, j, this.h, eventType);
                Q0(j, eventType);
            }
        }
    }

    public final void Q0(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fd301", new Object[]{this, aURARenderComponent, str});
            return;
        }
        dsv a2 = dsv.a(aURARenderComponent, str);
        fsv fsvVar = this.i;
        if (fsvVar != null) {
            fsvVar.a(a2);
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        String b = cgVar.b();
        if (!TextUtils.isEmpty(b)) {
            b.hashCode();
            if (b.equals(ri.CODE)) {
                P0(aURAInputData);
            }
        }
    }

    @Override // tb.ms, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.f = loVar.c();
        zcb zcbVar = (zcb) yiVar.e(zcb.class);
        if (zcbVar != null) {
            this.g = zcbVar.n0();
            this.h = zcbVar.M();
        }
    }

    @Override // tb.ms, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        aURAGlobalData.update("userMotionConfig", this.g);
        aURAGlobalData.update("userMotionCommonArgs", this.h);
        fsv fsvVar = (fsv) aURAGlobalData.get("userMotionRecorder", fsv.class);
        this.i = fsvVar;
        if (fsvVar == null) {
            fsv fsvVar2 = new fsv();
            this.i = fsvVar2;
            aURAGlobalData.update("userMotionRecorder", fsvVar2);
        }
    }
}
