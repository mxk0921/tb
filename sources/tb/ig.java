package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Stack;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.asyncModuleEntry.build")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ig extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public nbb f;
    public zt g;

    static {
        t2o.a(81788963);
    }

    public static /* synthetic */ Object ipc$super(ig igVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else if (hashCode == 148614476) {
            super.afterServiceExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/asyncModule/aspect/AURAAsyncModuleAspectLifecycleExtension");
        }
    }

    public final void P0(yk ykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcce37a", new Object[]{this, ykVar});
            return;
        }
        Serializable b = ykVar.b();
        if (b instanceof AURARenderIO) {
            AURARenderComponent renderTree = ((AURARenderIO) b).getRenderTree();
            Stack stack = new Stack();
            stack.push(renderTree);
            while (!stack.isEmpty()) {
                AURARenderComponent aURARenderComponent = (AURARenderComponent) stack.pop();
                if (aURARenderComponent != null) {
                    if (!aURARenderComponent.isLeaf()) {
                        for (AURARenderComponent aURARenderComponent2 : aURARenderComponent.children) {
                            stack.push(aURARenderComponent2);
                        }
                    } else if (aURARenderComponent.isLeaf() && aURARenderComponent.isAsync()) {
                        this.g.a(aURARenderComponent);
                    }
                }
            }
        }
    }

    @Override // tb.ms, tb.xab
    public void afterServiceExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbad4c", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(ykVar, cgVar, z);
        if (TextUtils.equals(cgVar.b(), dl.PARSE_SERVICE_CODE)) {
            P0(ykVar);
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
    }

    @Override // tb.ms, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        zt ztVar = (zt) aURAGlobalData.get("asyncModuleDispatcher", zt.class);
        if (ztVar == null) {
            ztVar = new jg(this.f);
            aURAGlobalData.update("asyncModuleDispatcher", ztVar);
        }
        this.g = ztVar;
    }
}
