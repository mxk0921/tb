package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import cn.wh.auth.server.a;
import com.alibaba.security.realidentity.i2;
import com.alipay.mobile.common.logging.api.LogContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class row {

    /* renamed from: a  reason: collision with root package name */
    public ppk f27517a;
    public final Activity b;
    public final cpw c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements a.AbstractC0024a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbo f27518a;

        public a(bbo bboVar) {
            this.f27518a = bboVar;
        }

        @Override // cn.wh.auth.server.a.AbstractC0024a
        public void onActivityResult(int i, int i2, Intent intent) {
            bbo bboVar = this.f27518a;
            if (i2 != -1 || i != 111) {
                bboVar.d(i2.j);
                bboVar.e("数据处理异常");
            } else if (intent != null) {
                bboVar.d(intent.getStringExtra("resultCode"));
                bboVar.e(intent.getStringExtra("resultDesc"));
                bboVar.b().c(intent.getStringExtra("idCardAuthData"));
                bboVar.b().b(intent.getStringExtra("certPwdData"));
                bboVar.b().d(intent.getStringExtra("verifyData"));
            } else {
                bboVar.d(i2.d);
                bboVar.e("用户已取消");
            }
            row.this.f27517a.onResult(bboVar);
        }
    }

    public row(Activity activity, cpw cpwVar) {
        this.b = activity;
        this.c = cpwVar;
    }

    public void a(ppk ppkVar) {
        this.f27517a = ppkVar;
        bbo bboVar = new bbo();
        cpw cpwVar = this.c;
        if (TextUtils.isEmpty(cpwVar.a())) {
            bboVar.e("应用ID异常");
            bboVar.d(i2.l);
            ppkVar.onResult(bboVar);
        } else if (TextUtils.isEmpty(cpwVar.c())) {
            bboVar.e("机构ID异常");
            bboVar.d(i2.k);
            ppkVar.onResult(bboVar);
        } else {
            Activity activity = this.b;
            if (!mq3.a(activity)) {
                bboVar.e("APP尚未安装");
                bboVar.d(i2.c);
                ppkVar.onResult(bboVar);
                return;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
            intent.setFlags(8388608);
            intent.putExtra("orgID", cpwVar.c());
            intent.putExtra(LogContext.STORAGE_APPID, cpwVar.a());
            intent.putExtra("bizSeq", cpwVar.b());
            intent.putExtra("type", cpwVar.d() + "");
            intent.putExtra("packageName", activity.getApplication().getPackageName());
            try {
                new cn.wh.auth.server.a(activity).c(intent, new a(bboVar));
            } catch (Exception unused) {
                bboVar.e("APP尚未安装");
                bboVar.d(i2.c);
                this.f27517a.onResult(bboVar);
            }
        }
    }
}
