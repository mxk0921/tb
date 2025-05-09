package com.taobao.taopai.material.maires;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.maires.a;
import com.taobao.taopai.material.maires.b;
import java.io.File;
import tb.t2o;
import tb.uf9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(782237776);
    }

    public void c(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b081f329", new Object[]{this, str, aVar});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.nyh
                @Override // java.lang.Runnable
                public final void run() {
                    b.b(str, aVar);
                }
            });
        }
    }

    public static /* synthetic */ void b(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b790cf5", new Object[]{str, aVar});
        } else if (TextUtils.isEmpty(str) || !str.endsWith("require.json")) {
            ((a.b) aVar).c(5);
        } else if (!new File(str).exists()) {
            ((a.b) aVar).c(2);
        } else {
            String i = uf9.i(str);
            if (!TextUtils.isEmpty(i)) {
                try {
                    ((a.b) aVar).d((MaiResDependenceList) JSON.parseObject(i, MaiResDependenceList.class));
                } catch (Exception e) {
                    e.printStackTrace();
                    ((a.b) aVar).c(4);
                }
            } else {
                ((a.b) aVar).c(3);
            }
        }
    }
}
