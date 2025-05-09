package com.taobao.share.picturepassword;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.visualcode.MtopGetShortUrlByGen3Request;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.android.agoo.common.AgooConstants;
import tb.a0m;
import tb.blo;
import tb.fwr;
import tb.gtl;
import tb.pg9;
import tb.qj0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareCopyAlbumChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f11757a = new AtomicBoolean(false);
    public static String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements a0m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11759a;

        public b(Context context) {
            this.f11759a = context;
        }

        @Override // tb.a0m.a
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba42d9de", new Object[]{this, str})).booleanValue();
            }
            if (this.f11759a.getPackageManager().checkPermission(str, this.f11759a.getPackageName()) == 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    static {
        t2o.a(665845816);
    }

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue();
        }
        return l(str);
    }

    public static /* synthetic */ boolean b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("592f538a", new Object[]{str, context})).booleanValue();
        }
        return k(str, context);
    }

    public static /* synthetic */ String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c6713b", new Object[]{str});
        }
        b = str;
        return str;
    }

    public static /* synthetic */ void d(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd68d320", new Object[]{str, cVar});
        } else {
            i(str, cVar);
        }
    }

    public static /* synthetic */ AtomicBoolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b9259ffb", new Object[0]);
        }
        return f11757a;
    }

    public static /* synthetic */ void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5478c", new Object[]{context});
        } else {
            g(context);
        }
    }

    public static void i(String str, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcbb6cdd", new Object[]{str, cVar});
            return;
        }
        MtopGetShortUrlByGen3Request mtopGetShortUrlByGen3Request = new MtopGetShortUrlByGen3Request();
        mtopGetShortUrlByGen3Request.setGen3code(str);
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopGetShortUrlByGen3Request);
        TLog.loge("TBShare#ShareCopyAlbumChecker", "log: 解码成功,获取视觉码对应的短链");
        build.registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.share.picturepassword.ShareCopyAlbumChecker.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TLog.loge("TBShare#ShareCopyAlbumChecker", "get short url error");
                ((gtl.c) c.this).a();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String optString = mtopResponse.getDataJsonObject().optString("shortUrl");
                if (TextUtils.isEmpty(optString)) {
                    TLog.loge("TBShare#ShareCopyAlbumChecker", "err: get short url success --> 1");
                    ((gtl.c) c.this).a();
                    return;
                }
                TLog.loge("TBShare#ShareCopyAlbumChecker", "log: get short url success --> 2  --> " + optString);
                ((gtl.c) c.this).b(optString);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TLog.loge("TBShare#ShareCopyAlbumChecker", "err: get short url system error");
                ((gtl.c) c.this).a();
            }
        });
        build.startRequest();
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17da9bc", new Object[]{context})).booleanValue();
        }
        try {
            return a0m.b(new b(context));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean k(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0e3fe47", new Object[]{str, context})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String b2 = qj0.a(context).b("latest_pic_add_date", null);
        if (TextUtils.isEmpty(b2)) {
            return true;
        }
        try {
            if (Long.parseLong(str) > Long.parseLong(b2)) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            TLog.loge("TBShare#ShareCopyAlbumChecker", "date数据转换失败");
            return false;
        }
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52c1686", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (System.currentTimeMillis() / 1000) - Long.parseLong(str) < Long.parseLong(blo.k("checkPicOutTime", AgooConstants.REPORT_NOT_ENCRYPT)) * 3600) {
            return true;
        }
        return false;
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2e7d7", new Object[]{context});
            return;
        }
        if (!TextUtils.isEmpty(b)) {
            qj0.a(context).c("latest_pic_add_date", b);
        }
        b = null;
    }

    public static void g(Context context) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4db737", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp_share_backflow_config", 0);
        if (!sharedPreferences.getBoolean("hasClearOldTempFile", false) && "true".equals(OrangeConfig.getInstance().getConfig("android_share", "deleteOldTempFile", "false"))) {
            try {
                File cacheDir = context.getCacheDir();
                if (!(cacheDir == null || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles()) == null)) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (!TextUtils.isEmpty(name) && name.split("\\.").length > 0) {
                            String str = name.split("\\.")[0];
                            if (str.length() == 13) {
                                try {
                                    if (Long.parseLong(str) > 0) {
                                        pg9.b(file);
                                        fwr.c("TBShare#ShareCopyAlbumChecker", "delete: " + file.getName());
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("hasClearOldTempFile", true);
                    edit.apply();
                }
            }
        }
    }

    public static void h(Context context, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1388c8bf", new Object[]{context, cVar});
        } else if (!blo.v()) {
            TLog.loge("TBShare#ShareCopyAlbumChecker", "share_can_read_photo_album false");
        } else if (!j(context)) {
            TLog.loge("TBShare#ShareCopyAlbumChecker", "return: 没有外部访问权限");
            ((gtl.c) cVar).a();
        } else {
            AtomicBoolean atomicBoolean = f11757a;
            if (atomicBoolean.get()) {
                TLog.loge("TBShare#ShareCopyAlbumChecker", "return: 正忙");
                ((gtl.c) cVar).a();
                return;
            }
            atomicBoolean.set(true);
            new a(context, cVar).execute(new Void[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11758a;
        public final /* synthetic */ c b;

        public a(Context context, c cVar) {
            this.f11758a = context;
            this.b = cVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/picturepassword/ShareCopyAlbumChecker$1");
        }

        /* renamed from: b */
        public void onPostExecute(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("213d104", new Object[]{this, r5});
                return;
            }
            super.onPostExecute(r5);
            ShareCopyAlbumChecker.e().set(false);
        }

        /* JADX WARN: Removed duplicated region for block: B:146:0x033f A[Catch: Exception -> 0x033b, TryCatch #13 {Exception -> 0x033b, blocks: (B:142:0x0337, B:146:0x033f, B:147:0x0342), top: B:197:0x0337 }] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0353 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0397 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0337 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:207:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:209:0x0247 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x018a A[Catch: all -> 0x032e, TryCatch #8 {all -> 0x032e, blocks: (B:39:0x00c4, B:43:0x00ce, B:46:0x00d5, B:48:0x00ff, B:50:0x0111, B:51:0x0120, B:53:0x0126, B:56:0x0135, B:58:0x0140, B:59:0x0152, B:61:0x015a, B:64:0x0162, B:66:0x0173, B:67:0x0184, B:69:0x018a, B:71:0x0192, B:73:0x0198, B:75:0x01a8, B:76:0x01e4, B:78:0x01ed, B:81:0x01f8, B:83:0x0213, B:84:0x0219, B:85:0x0221, B:86:0x022f, B:104:0x028c, B:120:0x02d7, B:49:0x0104), top: B:188:0x00c4 }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x024f A[Catch: Exception -> 0x024b, TryCatch #19 {Exception -> 0x024b, blocks: (B:88:0x0247, B:92:0x024f, B:93:0x0252), top: B:209:0x0247 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Void... r22) {
            /*
                Method dump skipped, instructions count: 958
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.share.picturepassword.ShareCopyAlbumChecker.a.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }
}
