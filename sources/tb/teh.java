package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.AddressKinshipBridge;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadStage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class teh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_DONE = "ALL_DONE";

    /* renamed from: a  reason: collision with root package name */
    public final Context f28662a;
    public z24 c;
    public String d;
    public UploadTokenInfo[] e;
    public TLogEventHelper.UploadEventInfo f;
    public File h;
    public final zfh i;
    public int g = 0;
    public int j = 0;
    public int k = 0;
    public List<String> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(teh tehVar) {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue();
            }
            String str3 = j5s.j().m() + "_";
            boolean contains = str.contains(str3);
            boolean contains2 = str2.contains(str3);
            if (contains && !contains2) {
                return -1;
            }
            if (contains || !contains2) {
                return (int) (new File(str2).lastModified() - new File(str).lastModified());
            }
            return 1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends ubk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(767557721);
        }

        public b(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/upload/LogFileUploadManager$TLogUploadListener");
        }

        @Override // tb.ff9
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b47bc65d", new Object[]{this, str, str2});
                return;
            }
            teh.e(teh.this).remove(0);
            teh.c(teh.this, 0);
            teh.h(teh.this);
            teh tehVar = teh.this;
            TLogEventHelper.v(tehVar.f, tehVar.c.c);
            teh.i(teh.this, this.f29276a, this.b, str2, this.c, this.d);
            teh.g(teh.this);
        }

        @Override // tb.ff9
        public void onError(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                return;
            }
            teh tehVar = teh.this;
            TLogEventHelper.t(tehVar.f, tehVar.c.c, str2, str3);
            if (teh.d(teh.this) <= 3) {
                teh tehVar2 = teh.this;
                TLogEventHelper.u(tehVar2.f, tehVar2.c.c);
                StringBuilder sb = new StringBuilder("[LogFileUploadManager] File Upload failed on retry: file=");
                String str4 = this.f29276a;
                if (str4 == null) {
                    str4 = "-";
                }
                sb.append(str4);
                sb.append(" error info=");
                if (str3 == null) {
                    str3 = "-";
                }
                sb.append(str3);
                sb.append(" errCode=");
                if (str2 == null) {
                    str2 = "-";
                }
                sb.append(str2);
                sb.append(" retryCount = ");
                sb.append(teh.b(teh.this));
                j5s.j().s().c(b6s.g, teh.this.c.c, sb.toString());
            } else {
                teh.e(teh.this).remove(0);
                teh.c(teh.this, 0);
                teh.f(teh.this, this.f29276a, this.b, str2, str3);
            }
            teh.g(teh.this);
        }
    }

    static {
        t2o.a(767557719);
    }

    public teh(Context context) {
        this.f28662a = context.getApplicationContext();
        zfh k = j5s.j().k();
        if (k == null) {
            TLog.loge("LogFileUploadManager", "", "Tlog have not init or do not have uploader!");
            return;
        }
        try {
            this.i = (zfh) k.getClass().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            this.i = k;
        }
    }

    public static /* synthetic */ int b(teh tehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f5b96aa", new Object[]{tehVar})).intValue();
        }
        return tehVar.g;
    }

    public static /* synthetic */ int c(teh tehVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b04eb05d", new Object[]{tehVar, new Integer(i)})).intValue();
        }
        tehVar.g = i;
        return i;
    }

    public static /* synthetic */ int d(teh tehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4465cae", new Object[]{tehVar})).intValue();
        }
        int i = tehVar.g + 1;
        tehVar.g = i;
        return i;
    }

    public static /* synthetic */ List e(teh tehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bff1774f", new Object[]{tehVar});
        }
        return tehVar.b;
    }

    public static /* synthetic */ void f(teh tehVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687e2061", new Object[]{tehVar, str, str2, str3, str4});
        } else {
            tehVar.n(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void g(teh tehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb58967a", new Object[]{tehVar});
        } else {
            tehVar.o();
        }
    }

    public static /* synthetic */ int h(teh tehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e8277b6", new Object[]{tehVar})).intValue();
        }
        int i = tehVar.k;
        tehVar.k = 1 + i;
        return i;
    }

    public static /* synthetic */ void i(teh tehVar, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb24bdee", new Object[]{tehVar, str, str2, str3, str4, str5});
        } else {
            tehVar.q(str, str2, str3, str4, str5);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e8488e", new Object[]{this, str});
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!TextUtils.isEmpty(str) && !this.b.contains(str)) {
            this.b.add(str);
        }
    }

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12b5ed0e", new Object[]{this, str});
        }
        UploadTokenInfo[] uploadTokenInfoArr = this.e;
        if (uploadTokenInfoArr == null) {
            return null;
        }
        for (UploadTokenInfo uploadTokenInfo : uploadTokenInfoArr) {
            FileInfo fileInfo = uploadTokenInfo.fileInfo;
            if (fileInfo != null && str.equals(fileInfo.absolutePath)) {
                return uploadTokenInfo.fileInfo.contentType;
            }
        }
        return null;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b4b80a", new Object[]{this});
        } else if (((ArrayList) this.b).size() > 0) {
            this.j = ((ArrayList) this.b).size();
            s5s s = j5s.j().s();
            String str = b6s.g;
            String str2 = this.c.c;
            s.b(str, str2, "[UploadFile] Start to upload file. Count: " + this.j);
            if (TextUtils.isEmpty(this.c.c)) {
                this.h = new File(b5s.m(), ten.a());
            } else {
                this.h = new File(b5s.m(), this.c.c);
            }
            TLogNative.appenderFlushData(true);
            this.g = 0;
            Collections.sort(this.b, new a(this));
            o();
        } else {
            String value = ErrorCode.UPLOAD_NO_FILE.getValue();
            TLogEventHelper.p(this.f, UploadStage.STAGE_UPLOAD, value, "errInfo", this.c.c);
            j5s.j().s().c(b6s.c, this.c.c, "[LogFileUploadManager] Upload file list is null.");
            if (this.c.e.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
                wfh.a(this.c, this.d, null, value, "[LogFileUploadManager] Upload file list is null.", null);
            } else {
                pa1.a(this.c, this.d, null, value, "[LogFileUploadManager] Upload file list is null.", null);
            }
            ff9 ff9Var = this.f.listener;
            if (ff9Var != null) {
                ff9Var.onError("", value, "[LogFileUploadManager] Upload file list is null.");
            }
        }
    }

    public final void n(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cca24d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        StringBuilder sb = new StringBuilder("[LogFileUploadManager] File upload failed: file=");
        String str7 = "-";
        if (str == null) {
            str5 = str7;
        } else {
            str5 = str;
        }
        sb.append(str5);
        sb.append(" error info=");
        if (str4 == null) {
            str6 = str7;
        } else {
            str6 = str4;
        }
        sb.append(str6);
        sb.append(" errCode=");
        if (str3 != null) {
            str7 = str3;
        }
        sb.append(str7);
        sb.append(" retryCount = ");
        sb.append(this.g);
        j5s.j().s().c(b6s.g, this.c.c, sb.toString());
        if (this.c.e.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
            wfh.a(this.c, this.d, str, str3, str4, str2);
        } else {
            pa1.a(this.c, this.d, str, str3, str4, str2);
        }
        ff9 ff9Var = this.f.listener;
        if (ff9Var != null) {
            ff9Var.onError(str, str3, str4);
        }
        n6s.d(this.h);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44b3d24", new Object[]{this});
        } else {
            e6s.d().c(new Runnable() { // from class: tb.seh
                @Override // java.lang.Runnable
                public final void run() {
                    teh.this.p();
                }
            });
        }
    }

    public final void q(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef64e8fb", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        s5s s = j5s.j().s();
        String str6 = b6s.g;
        String str7 = this.c.c;
        s.b(str6, str7, "[LogFileUploadManager] File upload successfully: " + str);
        if (this.c.e.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
            wfh.b(this.c, this.d, str, str3, str2, str4, str5);
        } else {
            pa1.b(this.c, this.d, str, str3, str2, str4, str5);
        }
        ff9 ff9Var = this.f.listener;
        if (ff9Var != null) {
            ff9Var.a(str, str3);
        }
        n6s.d(this.h);
    }

    public final Map<String, String> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("daf1b810", new Object[]{this, str});
        }
        UploadTokenInfo[] uploadTokenInfoArr = this.e;
        if (uploadTokenInfoArr != null) {
            for (UploadTokenInfo uploadTokenInfo : uploadTokenInfoArr) {
                FileInfo fileInfo = uploadTokenInfo.fileInfo;
                if (fileInfo != null && str.equals(fileInfo.absolutePath)) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, String> entry : uploadTokenInfo.entrySet()) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                    return hashMap;
                }
            }
        }
        n(str, null, ErrorCode.TOKEN_EMPTY.getValue(), "tokenNotFound");
        return null;
    }

    public final void p() {
        String str;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f528c3d", new Object[]{this});
        } else if (((ArrayList) this.b).size() == 0) {
            j5s.j().s().b(b6s.c, this.c.c, String.format("[LogFileUploadManager] All files upload done! Total: %d, Success: %d", Integer.valueOf(this.j), Integer.valueOf(this.k)));
            TLogEventHelper.l(this.f, this.j, this.k);
            ff9 ff9Var = this.f.listener;
            int i = this.j;
            if (i == this.k) {
                hf9.c(this.c.c);
                if (ff9Var != null) {
                    ff9Var.a(ALL_DONE, String.valueOf(this.j));
                }
            } else if (ff9Var != null) {
                ff9Var.onError(ALL_DONE, String.valueOf(i), String.valueOf(this.k));
            }
        } else {
            TLogEventHelper.s(this.f, this.c.c);
            String str2 = (String) ((ArrayList) this.b).get(0);
            if (!new File(str2).exists()) {
                this.j--;
                ((ArrayList) this.b).remove(0);
            } else if (this.i != null) {
                vmv vmvVar = new vmv();
                vmvVar.a(this.c);
                vmvVar.i = this.f28662a;
                vmvVar.j = j5s.j().e();
                String str3 = null;
                if ((this.f.flag & 4) == 4) {
                    vmvVar.k = null;
                } else {
                    vmvVar.k = this.h.getAbsolutePath();
                }
                vmvVar.m = l(str2);
                vmvVar.l = k(str2);
                if (this.i.b().f28810a.equals("oss")) {
                    Map<String, String> map2 = vmvVar.m;
                    if (map2 != null) {
                        str3 = map2.get("ossObjectKey");
                        str = vmvVar.m.get(AddressKinshipBridge.InnerReceiver.KEY_AUS_OSSENDPOINT);
                    } else {
                        str = null;
                    }
                    Map<String, String> map3 = vmvVar.m;
                    if (map3 != null && !map3.containsKey("ossBucketName")) {
                        vmvVar.m.put("ossBucketName", j5s.j().d);
                    }
                } else if (this.i.b().f28810a.equals("arup")) {
                    Map<String, String> map4 = vmvVar.m;
                    if (map4 != null) {
                        str3 = map4.get("ossObjectKey");
                        str = vmvVar.m.get(AddressKinshipBridge.InnerReceiver.KEY_AUS_OSSENDPOINT);
                    } else {
                        str = null;
                    }
                    Map<String, String> map5 = vmvVar.m;
                    if (map5 != null && !map5.containsKey("ossBucketName")) {
                        vmvVar.m.put("ossBucketName", j5s.j().d);
                    }
                } else {
                    if (!this.i.b().f28810a.equals("ceph") || (map = vmvVar.m) == null) {
                        str3 = null;
                        str = null;
                    } else {
                        str3 = map.get("objectKey");
                        str = vmvVar.m.get(AURASubmitEvent.RPC_ENDPOINT);
                    }
                    j5s.j().s().b(b6s.g, this.c.c, "[LogFileUploadManager] Call uploader to update...");
                    this.i.a(vmvVar, str2, new b(str2, vmvVar.l, str3, str));
                }
                j5s.j().s().b(b6s.g, this.c.c, "[LogFileUploadManager] Call uploader to update...");
                this.i.a(vmvVar, str2, new b(str2, vmvVar.l, str3, str));
            } else {
                String value = ErrorCode.NOT_IMPLEMENTED.getValue();
                j5s.j().s().c(b6s.g, this.c.c, "[LogFileUploadManager] Need file uploader");
                TLogEventHelper.t(this.f, this.c.c, value, "[LogFileUploadManager] Need file uploader");
                ff9 ff9Var2 = this.f.listener;
                if (ff9Var2 != null) {
                    ff9Var2.onError(str2, value, "[LogFileUploadManager] Need file uploader");
                }
                ((ArrayList) this.b).remove(0);
            }
        }
    }
}
