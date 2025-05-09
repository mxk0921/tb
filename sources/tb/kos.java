package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f22815a;
    public final View b;
    public final View c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends pj5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261221);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -858210922) {
                return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTPadPageManager$DetailDXDataParserDXEnv");
        }

        @Override // tb.pj5, tb.nb5, tb.evb
        public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
            }
            if (objArr == null || objArr.length == 0) {
                return null;
            }
            if ("platformDetail".equals(objArr[0])) {
                return "1";
            }
            return super.evalWithArgs(objArr, dXRuntimeContext);
        }
    }

    static {
        t2o.a(912261220);
    }

    public kos(ze7 ze7Var, View view, View view2) {
        this.f22815a = ze7Var;
        this.b = view;
        this.c = view2;
        view.findViewById(R.id.v_head_skeleton_holder).setBackgroundColor(-1250068);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7217d498", new Object[]{this});
            return;
        }
        b1i b1iVar = (b1i) this.f22815a.h().d("mainScreen");
        if (b1iVar != null) {
            oa4 y = b1iVar.y();
            ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.ll_headerLayout);
            y.create();
            View componentView = y.getComponentView(null);
            ygw.a(componentView);
            viewGroup.removeAllViews();
            viewGroup.addView(componentView);
            y.willAppear();
            y.didAppear();
            View findViewById = this.c.findViewById(R.id.tt_scrollerLayout);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.rightMargin = owo.b(this.f22815a.c(), 16.0f);
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }
}
