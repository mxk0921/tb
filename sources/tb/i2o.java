package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i2o implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21058a;
    public BottomSheetDialog b;
    public BottomSheetBehavior<View> c;
    public String d;
    public final q2o e;
    public final ux9 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends BottomSheetBehavior.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/report/ReportController$1");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void a(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af574147", new Object[]{this, view, new Float(f)});
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc8f5da", new Object[]{this, view, new Integer(i)});
            } else if (i == 5) {
                i2o.a(i2o.this).dismiss();
                i2o.b(i2o.this).setState(4);
            }
        }
    }

    static {
        t2o.a(295698579);
    }

    public i2o(Context context, q2o q2oVar, ux9 ux9Var) {
        this.f21058a = context;
        this.e = q2oVar;
        this.f = ux9Var;
    }

    public static /* synthetic */ BottomSheetDialog a(i2o i2oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomSheetDialog) ipChange.ipc$dispatch("4c52cbb7", new Object[]{i2oVar});
        }
        return i2oVar.b;
    }

    public static /* synthetic */ BottomSheetBehavior b(i2o i2oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomSheetBehavior) ipChange.ipc$dispatch("8743a0c", new Object[]{i2oVar});
        }
        return i2oVar.c;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.d = str;
            e();
            this.c.setState(3);
            this.b.show();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713addfd", new Object[]{this});
            return;
        }
        String D = k0r.D();
        if (!TextUtils.isEmpty(D)) {
            HashMap hashMap = new HashMap();
            hashMap.put("from", "commentDetail");
            hashMap.put("subjectType", "LIVE_COMMENT");
            hashMap.put(FluidInstanceAnalysis.KEY_SOURCE, this.e.f26466a);
            hashMap.put("subjectId", this.d);
            hashMap.put("reportType", "COMMENT");
            String a2 = qnv.a(D, hashMap);
            String E = k0r.E();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) a2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("params", jSONObject.toJSONString());
            String a3 = qnv.a(E, hashMap2);
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", a3);
            intent.putExtra("param", a3);
            LocalBroadcastManager.getInstance(this.f21058a).sendBroadcast(intent);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86934c2", new Object[]{this});
        } else if (this.b == null) {
            View inflate = LayoutInflater.from(this.f21058a).inflate(R.layout.taolive_comment_report_layout_flexalocal, (ViewGroup) null);
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this.f21058a, R.style.TL_Comments_BottomSheetDialog_flexalocal);
            this.b = bottomSheetDialog;
            bottomSheetDialog.setContentView(inflate);
            BottomSheetBehavior<View> from = BottomSheetBehavior.from((View) inflate.getParent());
            this.c = from;
            from.setBottomSheetCallback(new a());
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.tl_comment_report), this);
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.tl_comment_cancel), this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.tl_comment_report) {
            this.c.setState(5);
            d();
            giv.f().n(this.f, "commentreport", new String[0]);
        } else if (view.getId() == R.id.tl_comment_cancel) {
            this.c.setState(5);
        }
    }
}
