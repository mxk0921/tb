package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.io.File;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kv7 extends AsyncTask<String, Void, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<n6w> f22946a;
    public final String b;

    static {
        t2o.a(491782173);
    }

    public kv7(n6w n6wVar, String str) {
        this.f22946a = new WeakReference<>(n6wVar);
        this.b = str;
    }

    public static /* synthetic */ Object ipc$super(kv7 kv7Var, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/view/video/videoimpl/DownloadVideoTask");
    }

    /* renamed from: a */
    public Boolean doInBackground(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("523c617", new Object[]{this, strArr});
        }
        RequestImpl requestImpl = new RequestImpl(this.b);
        if (vxl.b().d()) {
            fve.e("DownloadVideoTask", "disableDownloadViewWithCookie...disable cookie");
            requestImpl.setExtProperty(RequestConstant.ENABLE_COOKIE, "false");
        }
        Response syncSend = new DegradableNetwork(null).syncSend(requestImpl, null);
        if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
            try {
                String b = ncw.b(this.b);
                if (TextUtils.isEmpty(b)) {
                    return Boolean.FALSE;
                }
                boolean e = zd9.e(b, syncSend.getBytedata());
                fve.e("DownloadVideoTask", "DownloadVideoTask downLoadVideo saveResult:" + e + " filePath:" + b + " success; url:" + this.b);
                if (!e) {
                    File file = new File(b);
                    if (file.exists()) {
                        fve.e("DownloadVideoTask", "DownloadVideoTask", "ErrorDownloadFile");
                        TBS.Ext.commitEvent("Page_Home", 19999, "ErrorDownloadFile", "");
                        file.delete();
                    }
                }
                return Boolean.valueOf(e);
            } catch (Throwable th) {
                fve.c("DownloadVideoTask", "DownloadVideoTask", th);
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: b */
    public void onPostExecute(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98eb50", new Object[]{this, bool});
            return;
        }
        super.onPostExecute(bool);
        fve.e("DownloadVideoTask", "DownloadVideoTask onPostExecute ret:" + bool + "  url:" + this.b);
        n6w n6wVar = this.f22946a.get();
        if (n6wVar == null) {
            fve.e("DownloadVideoTask", "onPostExecute videoDownLoadListener is null");
        } else if (bool == null || !bool.booleanValue()) {
            n6wVar.onFail();
        } else {
            n6wVar.onSuccess(this.b);
        }
    }
}
