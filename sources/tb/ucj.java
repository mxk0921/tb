package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ucj extends e8i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237889);
    }

    public ucj() {
        super(null);
    }

    public static File I(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c6625927", new Object[]{str, str2});
        }
        String g = ztl.g(str);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            return new File(g, str + ".mp3");
        }
        return new File(g, str + "_" + str2 + ".mp3");
    }

    public static File J(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("783dd227", new Object[]{str, str2});
        }
        String g = ztl.g(str);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            return new File(g, str + "_wave.txt");
        }
        return new File(g, str + "_" + str2 + "_wave.txt");
    }

    public static /* synthetic */ Object ipc$super(ucj ucjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/business/res/MusicDownloadTask");
    }

    public final /* synthetic */ void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb06e5a0", new Object[]{this, str});
        } else if (this.g == null) {
        } else {
            if (uf9.g(str)) {
                this.g.b(this.c, str);
            } else {
                this.g.a(this.c, "file_not_exist", "file not exist");
            }
        }
    }

    @Override // tb.e8i, tb.tu7
    public void onDownloadFinish(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        p();
        ovu.b(new Runnable() { // from class: tb.scj
            @Override // java.lang.Runnable
            public final void run() {
                ucj.this.K(str2);
            }
        });
    }
}
