package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import java.io.File;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sqh extends vqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashSet<String> b = new HashSet<>();

    static {
        t2o.a(577765389);
    }

    public sqh(MRTResourceDescription mRTResourceDescription) {
        super(mRTResourceDescription);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e10890f", new Object[]{str});
            return;
        }
        synchronized (sqh.class) {
            b.add(str);
        }
    }

    public static boolean f(String str) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf47aaf5", new Object[]{str})).booleanValue();
        }
        synchronized (sqh.class) {
            contains = b.contains(str);
        }
        return contains;
    }

    public static /* synthetic */ Object ipc$super(sqh sqhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/fileoperation/MRTPythonLibsOperation");
    }

    @Override // tb.vqh
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a359826", new Object[]{this, str});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e29", new Object[]{this});
        } else if ("core".equalsIgnoreCase(this.f30181a.resourceName)) {
            String str = this.f30181a.resourceRootDirectory + "/" + this.f30181a.resourceName;
            try {
                if (!f(str)) {
                    AliNNPython.addPythonPath(str);
                    d(str);
                    kgh.j("MRTPythonLibsOperation", "python lib addPath success!!! " + str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            File file = new File(str, "innerlib");
            if (file.exists()) {
                try {
                    if (!f(file.getAbsolutePath())) {
                        AliNNPython.addPythonPath(file.getAbsolutePath());
                        d(file.getAbsolutePath());
                        kgh.j("MRTPythonLibsOperation", "python lib addPath success!!! " + file.getAbsolutePath());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            String str2 = this.f30181a.resourceRootDirectory + "/" + this.f30181a.resourceName;
            try {
                if (!f(str2)) {
                    AliNNPython.addPythonPath(str2);
                    d(str2);
                    kgh.j("MRTPythonLibsOperation", "python lib addPath success!!! " + str2);
                } else {
                    kgh.j("MRTPythonLibsOperation", "python lib had add path success!!! " + str2);
                }
            } catch (Exception e3) {
                kgh.j("MRTPythonLibsOperation", "python lib addPath error!!! " + str2);
                e3.printStackTrace();
            }
        }
    }

    @Override // tb.vqh
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4232e32", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            kgh.c("MRTPythonLibsOperation", "python lib unzip error, download path null");
            return false;
        }
        MRTResourceDescription mRTResourceDescription = this.f30181a;
        File file = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
        if (file.exists()) {
            mqh.k(file);
        }
        mqh.u(new File(str), new File(this.f30181a.resourceRootDirectory));
        return true;
    }

    @Override // tb.vqh
    public boolean c() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39404e61", new Object[]{this})).booleanValue();
        }
        MRTResourceDescription mRTResourceDescription = this.f30181a;
        if (mRTResourceDescription != null && (mRTResourceDescription instanceof MRTPythonLibDescription)) {
            MRTPythonLibDescription mRTPythonLibDescription = (MRTPythonLibDescription) mRTResourceDescription;
            String str = this.f30181a.resourceRootDirectory + "/" + this.f30181a.resourceName;
            File file = new File(str);
            if (file.isDirectory() && file.exists()) {
                if (!mqh.a(mRTPythonLibDescription.mmd5, str)) {
                    kgh.c("MRTPythonLibsOperation", "python lib mmd5 error!!!" + str);
                    return false;
                }
                e();
                return true;
            }
        }
        return false;
    }
}
