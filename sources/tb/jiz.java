package tb;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.xob;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb/jiz;", "Ltb/xob;", "Lcom/alibaba/fastjson/JSONObject;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jiz implements xob<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22021a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a extends na4<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cc4 i;

        public a(cc4 cc4Var) {
            this.i = cc4Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/component/NativeComponentFactory$defaultNativeView$defaultComponent$1");
        }

        @Override // tb.na4
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            }
        }

        @Override // tb.na4
        public View d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
            }
            TextView textView = new TextView(jiz.b(jiz.this));
            textView.setText("no native type " + this.i.b() + " found");
            return textView;
        }

        @Override // tb.na4
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(804257833);
        t2o.a(803209232);
    }

    public jiz(Context context) {
        ckf.g(context, "context");
        this.f22021a = context;
    }

    public static final /* synthetic */ Context b(jiz jizVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("93f938a8", new Object[]{jizVar});
        }
        return jizVar.f22021a;
    }

    @Override // tb.xob
    public na4<JSONObject> a(cc4 cc4Var, mb4<JSONObject> mb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (na4) ipChange.ipc$dispatch("8ab35a8", new Object[]{this, cc4Var, mb4Var});
        }
        ckf.g(cc4Var, "info");
        ckf.g(mb4Var, "data");
        if (ckf.b(cc4Var.b(), "imgTxt")) {
            return new aaz(this.f22021a);
        }
        return c(cc4Var);
    }

    public final na4<JSONObject> c(cc4 cc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (na4) ipChange.ipc$dispatch("96250336", new Object[]{this, cc4Var});
        }
        return new a(cc4Var);
    }

    @Override // tb.xob
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            xob.a.a(this);
        }
    }
}
