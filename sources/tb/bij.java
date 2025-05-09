package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.aura.AURADismissFloatEvent_InputField_floatView;
import com.alibaba.android.aura.AURARaxComponentExtension_InputField_floatView;
import com.alibaba.android.aura.datamodel.AURAEmptySerializable;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bij implements dyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nbb f16405a;
    public fyc b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eyc f16406a;

        public a(bij bijVar, eyc eycVar) {
            this.f16406a = eycVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/render/impl/NUTFloatContentAURARender$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                ((NUTFragmentFloatContainer.c) this.f16406a).b(miVar);
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            Serializable b = ykVar.b();
            if (b instanceof AURARenderOutput) {
                View view = ((AURARenderOutput) b).getView();
                if (view == null) {
                    ((NUTFragmentFloatContainer.c) this.f16406a).b(new mi(0, "NUTFloatView", "render-exception", "result view is null"));
                } else {
                    ((NUTFragmentFloatContainer.c) this.f16406a).c(view);
                }
            } else {
                ((NUTFragmentFloatContainer.c) this.f16406a).b(new mi(0, "NUTFloatView", "render-exception", "illegal output, not render output: AURARenderOutput"));
            }
        }
    }

    static {
        t2o.a(81789347);
        t2o.a(81789345);
    }

    @Override // tb.dyc
    public void a(fyc fycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d743f67", new Object[]{this, fycVar});
        } else {
            this.b = fycVar;
        }
    }

    public final String c(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fe2b12", new Object[]{this, map, str, str2});
        }
        if (map == null) {
            return str2;
        }
        Object obj = map.get(str);
        if (!(obj instanceof String)) {
            return str2;
        }
        return (String) obj;
    }

    @Override // tb.dyc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        nbb nbbVar = this.f16405a;
        if (nbbVar != null) {
            nbbVar.destroy();
            this.f16405a = null;
        }
        this.b = null;
    }

    @Override // tb.dyc
    public boolean b(Context context, Map<String, Object> map, eyc eycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edc8f8b0", new Object[]{this, context, map, eycVar})).booleanValue();
        }
        nbb nbbVar = (nbb) fk.b(map, "auraInstance", nbb.class, null);
        nbb nbbVar2 = this.f16405a;
        if (!(nbbVar == nbbVar2 || nbbVar2 == null)) {
            nbbVar2.destroy();
            this.f16405a = null;
        }
        this.f16405a = nbbVar;
        if (nbbVar == null) {
            ((NUTFragmentFloatContainer.c) eycVar).b(new mi(0, "NUTFloatView", "render-exception", "请设置AURAInstance参数到params中，key为：NUTFloatViewConstants.RenderParam.KEY_AURA_INSTANCE"));
            return false;
        }
        String c = c(map, "startPointWorkflow", null);
        if (TextUtils.isEmpty(c)) {
            ((NUTFragmentFloatContainer.c) eycVar).b(new mi(0, "NUTFloatView", "render-exception", "param: startPointWorkflow is empty"));
            return false;
        }
        ((mj) ((mj) nbbVar.b(new AURADismissFloatEvent_InputField_floatView(this.b))).b(new AURARaxComponentExtension_InputField_floatView(this.b))).c(c, (Serializable) fk.b(map, "startPointInputIO", Serializable.class, new AURAEmptySerializable()), new a(this, eycVar));
        return true;
    }
}
