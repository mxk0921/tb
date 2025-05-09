package com.alibaba.ability.impl.downloader;

import android.os.SystemClock;
import com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsDownloaderAbility;
import com.taobao.android.abilityidl.ability.DownloaderCompleteResult;
import com.taobao.android.abilityidl.ability.DownloaderProgressResult;
import java.io.File;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.n0c;
import tb.t2o;
import tb.tv7;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DownloaderAbility extends AbsDownloaderAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public volatile DownloadCenter.a f1936a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(104857603);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements DownloadCenter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f1937a;
        public final /* synthetic */ int c;
        public final /* synthetic */ n0c d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public b(int i, n0c n0cVar, String str, String str2) {
            this.c = i;
            this.d = n0cVar;
            this.e = str;
            this.f = str2;
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void a(DownloadCenter.DownloadError downloadError, String str) {
            ErrorResult errorResult;
            String str2;
            String str3;
            String str4;
            String str5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c634c61", new Object[]{this, downloadError, str});
                return;
            }
            ckf.g(downloadError, "error");
            n0c n0cVar = this.d;
            int i = tv7.$EnumSwitchMapping$0[downloadError.ordinal()];
            if (i == 1) {
                if (str != null) {
                    str2 = str;
                } else {
                    str2 = "";
                }
                errorResult = new ErrorResult("OUT_OF_SPACE", str2, (Map) null, 4, (a07) null);
            } else if (i == 2) {
                if (str != null) {
                    str3 = str;
                } else {
                    str3 = "";
                }
                errorResult = new ErrorResult("NETWORK_ERROR", str3, (Map) null, 4, (a07) null);
            } else if (i == 3) {
                if (str != null) {
                    str4 = str;
                } else {
                    str4 = "";
                }
                errorResult = new ErrorResult("FILE_MD5_ERROR", str4, (Map) null, 4, (a07) null);
            } else if (i != 4) {
                errorResult = new ErrorResult("500", "errorCode:" + downloadError + ", msg:" + str, (Map) null, 4, (a07) null);
            } else {
                if (str != null) {
                    str5 = str;
                } else {
                    str5 = "";
                }
                errorResult = new ErrorResult("FILE_SIZE_ERROR", str5, (Map) null, 4, (a07) null);
            }
            n0cVar.O(errorResult);
            DownloaderAbility.access$setCurrentDownloadInfo$p(DownloaderAbility.this, null);
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            this.d.onCancel();
            DownloaderAbility.access$setCurrentDownloadInfo$p(DownloaderAbility.this, null);
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i == 100 || uptimeMillis - this.f1937a >= this.c) {
                this.f1937a = uptimeMillis;
                n0c n0cVar = this.d;
                DownloaderProgressResult downloaderProgressResult = new DownloaderProgressResult();
                downloaderProgressResult.progress = Double.valueOf(i);
                xhv xhvVar = xhv.INSTANCE;
                n0cVar.w0(downloaderProgressResult);
            }
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            ckf.g(str, "filePath");
            n0c n0cVar = this.d;
            DownloaderCompleteResult downloaderCompleteResult = new DownloaderCompleteResult();
            downloaderCompleteResult.path = this.e + File.separator + this.f;
            xhv xhvVar = xhv.INSTANCE;
            n0cVar.N0(downloaderCompleteResult);
            DownloaderAbility.access$setCurrentDownloadInfo$p(DownloaderAbility.this, null);
        }
    }

    static {
        t2o.a(104857602);
    }

    public static final /* synthetic */ DownloadCenter.a access$getCurrentDownloadInfo$p(DownloaderAbility downloaderAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloadCenter.a) ipChange.ipc$dispatch("23d68cd8", new Object[]{downloaderAbility});
        }
        return downloaderAbility.f1936a;
    }

    public static final /* synthetic */ void access$setCurrentDownloadInfo$p(DownloaderAbility downloaderAbility, DownloadCenter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d076cd0", new Object[]{downloaderAbility, aVar});
        } else {
            downloaderAbility.f1936a = aVar;
        }
    }

    public static /* synthetic */ Object ipc$super(DownloaderAbility downloaderAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/downloader/DownloaderAbility");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        DownloadCenter.a aVar = this.f1936a;
        if (aVar != null) {
            DownloadCenter.INSTANCE.b(aVar);
            this.f1936a = null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsDownloaderAbility
    public void cancel(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c84bf6c", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        a();
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.ability.impl.downloader.DownloaderAbility.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "5a2bde27"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r9
            r3[r0] = r10
            java.lang.Object r10 = r1.ipc$dispatch(r2, r3)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x0018:
            r1 = 0
            if (r10 == 0) goto L_0x0063
            java.lang.CharSequence r10 = tb.wsq.Q0(r10)     // Catch: all -> 0x005b
            java.lang.String r10 = r10.toString()     // Catch: all -> 0x005b
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: all -> 0x005b
            java.lang.String r2 = "Uri.parse(url.trim())"
            tb.ckf.f(r10, r2)     // Catch: all -> 0x005b
            java.lang.String r10 = r10.getPath()     // Catch: all -> 0x005b
            if (r10 == 0) goto L_0x005d
            java.lang.String r4 = "/"
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r10
            int r2 = tb.wsq.e0(r3, r4, r5, r6, r7, r8)     // Catch: all -> 0x005b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: all -> 0x005b
            int r3 = r2.intValue()     // Catch: all -> 0x005b
            r4 = -1
            if (r3 == r4) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r2 = r1
        L_0x004a:
            if (r2 == 0) goto L_0x005d
            int r2 = r2.intValue()     // Catch: all -> 0x005b
            int r2 = r2 + r0
            java.lang.String r10 = r10.substring(r2)     // Catch: all -> 0x005b
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            tb.ckf.f(r10, r0)     // Catch: all -> 0x005b
            goto L_0x005e
        L_0x005b:
            r10 = move-exception
            goto L_0x006c
        L_0x005d:
            r10 = r1
        L_0x005e:
            java.lang.Object r10 = kotlin.Result.m1108constructorimpl(r10)     // Catch: all -> 0x005b
            goto L_0x0074
        L_0x0063:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: all -> 0x005b
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r10.<init>(r0)     // Catch: all -> 0x005b
            throw r10     // Catch: all -> 0x005b
        L_0x006c:
            java.lang.Object r10 = kotlin.b.a(r10)
            java.lang.Object r10 = kotlin.Result.m1108constructorimpl(r10)
        L_0x0074:
            boolean r0 = kotlin.Result.m1114isFailureimpl(r10)
            if (r0 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r1 = r10
        L_0x007c:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.downloader.DownloaderAbility.b(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        if (r0 != null) goto L_0x00d7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
        if (r8 != r0.longValue()) goto L_0x0147;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    @Override // com.taobao.android.abilityidl.ability.AbsDownloaderAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void download(tb.kdb r21, tb.xv7 r22, tb.n0c r23) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.downloader.DownloaderAbility.download(tb.kdb, tb.xv7, tb.n0c):void");
    }
}
