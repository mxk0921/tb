package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import io.reactivex.disposables.Disposable;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237778);
    }

    public static o23 c(String str, MaterialDetailBean materialDetailBean, crc crcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o23) ipChange.ipc$dispatch("c793ad51", new Object[]{str, materialDetailBean, crcVar});
        }
        u8i u8iVar = new u8i(materialDetailBean.getMaterialType(), materialDetailBean.getVersion(), String.valueOf(materialDetailBean.getTid()), materialDetailBean.getResourceUrl());
        u8iVar.h(false);
        u8iVar.r(ztl.b(str, materialDetailBean.resourceUrl));
        m6o m6oVar = new m6o(u8iVar, crcVar);
        m6oVar.e();
        return m6oVar;
    }

    public static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2694607e", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String i = ztl.i(str, false);
            if (!TextUtils.isEmpty(i) && new File(i).exists()) {
                String valueOf = String.valueOf(str2.hashCode());
                File[] listFiles = new File(i).listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file : listFiles) {
                        if (TextUtils.equals(valueOf, file.getName()) && t8i.i(file)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void e(frc frcVar, MaiResResponseModel maiResResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1cb262", new Object[]{frcVar, maiResResponseModel});
        } else if (maiResResponseModel == null || TextUtils.isEmpty(maiResResponseModel.resourceUrl)) {
            frcVar.onFail("", f4w.LOAD_DATA_NULL);
        } else {
            frcVar.onSuccess(maiResResponseModel);
        }
    }

    public static /* synthetic */ void f(frc frcVar, Throwable th) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d02e3b", new Object[]{frcVar, th});
            return;
        }
        if (th.getMessage() != null) {
            str = "get url error " + th.getMessage();
        } else {
            str = "get url error";
        }
        frcVar.onFail("", str);
    }

    public static Disposable g(String str, final frc<MaterialDetailBean> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("9e598cd0", new Object[]{str, frcVar});
        }
        return MaterialDataServer.y(act.b(), act.c(), 1).A(158001, 104, str).subscribe(new mk4() { // from class: tb.z8o
            public final void accept(Object obj) {
                b9o.e(frc.this, (MaiResResponseModel) obj);
            }
        }, new mk4() { // from class: tb.a9o
            public final void accept(Object obj) {
                b9o.f(frc.this, (Throwable) obj);
            }
        });
    }
}
