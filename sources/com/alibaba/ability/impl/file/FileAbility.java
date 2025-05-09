package com.alibaba.ability.impl.file;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFileAbility;
import com.taobao.android.abilityidl.ability.FileCommonResult;
import com.taobao.android.abilityidl.ability.FileDirInfoResult;
import com.taobao.android.abilityidl.ability.FileInfoResult;
import com.taobao.android.abilityidl.ability.FileItem;
import com.taobao.android.abilityidl.ability.FileReadAsStringResult;
import com.taobao.android.abilityidl.ability.FileRenameFileResult;
import com.taobao.android.abilityidl.ability.FileUnzipResult;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.acp;
import tb.ap7;
import tb.bc9;
import tb.bf9;
import tb.bqo;
import tb.bvl;
import tb.c3c;
import tb.ckf;
import tb.dc9;
import tb.gd9;
import tb.gh9;
import tb.hpo;
import tb.ih9;
import tb.iih;
import tb.jd9;
import tb.k2d;
import tb.kdb;
import tb.lc9;
import tb.ld9;
import tb.ljn;
import tb.lqx;
import tb.oc9;
import tb.p6c;
import tb.ph9;
import tb.q6c;
import tb.qc9;
import tb.s6c;
import tb.sm8;
import tb.t2o;
import tb.tao;
import tb.tsq;
import tb.u6c;
import tb.uc9;
import tb.uj3;
import tb.v6c;
import tb.w6c;
import tb.wh6;
import tb.wsq;
import tb.wva;
import tb.xhv;
import tb.zo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FileAbility extends AbsFileAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long MAX_DIR_SIZE = 52428800;
    public static final long MAX_FILE_SIZE = 10485760;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(106954760);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(106954759);
    }

    public static /* synthetic */ Object ipc$super(FileAbility fileAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/file/FileAbility");
    }

    public static /* synthetic */ ExecuteResult writeFile$default(FileAbility fileAbility, kdb kdbVar, String str, String str2, ByteBuffer byteBuffer, String str3, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("54e419aa", new Object[]{fileAbility, kdbVar, str, str2, byteBuffer, str3, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 16) != 0) {
            str3 = "utf-8";
        }
        return fileAbility.b(kdbVar, str, str2, byteBuffer, str3, z);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d10349", new Object[]{this, str});
        }
        switch (str.hashCode()) {
            case -2056547891:
                if (str.equals("LATIN1")) {
                    return "latin1";
                }
                return "utf-8";
            case 71419:
                if (str.equals("HEX")) {
                    return "hex";
                }
                return "utf-8";
            case 2614125:
                if (str.equals("USC2")) {
                    return "ucs-2";
                }
                return "utf-8";
            case 2615185:
                str.equals("UTF8");
                return "utf-8";
            case 62568241:
                if (str.equals("ASCII")) {
                    return "ascii";
                }
                return "utf-8";
            case 81070572:
                if (str.equals("UTF16")) {
                    return "utf-16";
                }
                return "utf-8";
            case 1952093519:
                if (str.equals("BASE64")) {
                    return "base64";
                }
                return "utf-8";
            default:
                return "utf-8";
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void appendFile(kdb kdbVar, ih9 ih9Var, p6c p6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d28f1a", new Object[]{this, kdbVar, ih9Var, p6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ih9Var, "params");
        ckf.g(p6cVar, "callback");
        tao<Boolean, ErrorResult> appendFileSync = appendFileSync(kdbVar, ih9Var);
        ErrorResult d = appendFileSync.d();
        if (d != null) {
            p6cVar.O(d);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = appendFileSync.c();
        xhv xhvVar = xhv.INSTANCE;
        p6cVar.s1(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void copyFile(kdb kdbVar, dc9 dc9Var, p6c p6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a149ca4d", new Object[]{this, kdbVar, dc9Var, p6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(dc9Var, "params");
        ckf.g(p6cVar, "callback");
        tao<Boolean, ErrorResult> copyFileSync = copyFileSync(kdbVar, dc9Var);
        ErrorResult d = copyFileSync.d();
        if (d != null) {
            p6cVar.O(d);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = copyFileSync.c();
        xhv xhvVar = xhv.INSTANCE;
        p6cVar.s1(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void exists(kdb kdbVar, bc9 bc9Var, p6c p6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53180ab2", new Object[]{this, kdbVar, bc9Var, p6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(bc9Var, "params");
        ckf.g(p6cVar, "callback");
        tao<Boolean, ErrorResult> existsSync = existsSync(kdbVar, bc9Var);
        ErrorResult d = existsSync.d();
        if (d != null) {
            p6cVar.O(d);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = existsSync.c();
        xhv xhvVar = xhv.INSTANCE;
        p6cVar.s1(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void getDirInfo(kdb kdbVar, bc9 bc9Var, q6c q6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6843d37d", new Object[]{this, kdbVar, bc9Var, q6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(bc9Var, "params");
        ckf.g(q6cVar, "callback");
        tao<List<FileItem>, ErrorResult> dirInfoSync = getDirInfoSync(kdbVar, bc9Var);
        ErrorResult d = dirInfoSync.d();
        if (d != null) {
            q6cVar.O(d);
            return;
        }
        FileDirInfoResult fileDirInfoResult = new FileDirInfoResult();
        fileDirInfoResult.files = dirInfoSync.c();
        xhv xhvVar = xhv.INSTANCE;
        q6cVar.p0(fileDirInfoResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void getFileInfo(kdb kdbVar, qc9 qc9Var, s6c s6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07467b6", new Object[]{this, kdbVar, qc9Var, s6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(qc9Var, "params");
        ckf.g(s6cVar, "callback");
        tao<FileInfoResult, ErrorResult> fileInfoSync = getFileInfoSync(kdbVar, qc9Var);
        ErrorResult d = fileInfoSync.d();
        if (d != null) {
            s6cVar.O(d);
            return;
        }
        FileInfoResult c = fileInfoSync.c();
        if (c != null) {
            s6cVar.u(c);
        } else {
            s6cVar.O(new ErrorResult("500", "get file info fail, unknown error", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void makeDir(kdb kdbVar, uc9 uc9Var, p6c p6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3590e75", new Object[]{this, kdbVar, uc9Var, p6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(uc9Var, "params");
        ckf.g(p6cVar, "callback");
        tao<Boolean, ErrorResult> makeDirSync = makeDirSync(kdbVar, uc9Var);
        ErrorResult d = makeDirSync.d();
        if (d != null) {
            p6cVar.O(d);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = makeDirSync.c();
        xhv xhvVar = xhv.INSTANCE;
        p6cVar.s1(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void readAsString(kdb kdbVar, gd9 gd9Var, u6c u6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a52af", new Object[]{this, kdbVar, gd9Var, u6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(gd9Var, "params");
        ckf.g(u6cVar, "callback");
        tao<String, ErrorResult> readAsStringSync = readAsStringSync(kdbVar, gd9Var);
        ErrorResult d = readAsStringSync.d();
        if (d != null) {
            u6cVar.O(d);
            return;
        }
        FileReadAsStringResult fileReadAsStringResult = new FileReadAsStringResult();
        fileReadAsStringResult.data = readAsStringSync.c();
        xhv xhvVar = xhv.INSTANCE;
        u6cVar.o1(fileReadAsStringResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void removeDir(kdb kdbVar, jd9 jd9Var, p6c p6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be2cfb5", new Object[]{this, kdbVar, jd9Var, p6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jd9Var, "params");
        ckf.g(p6cVar, "callback");
        tao<Boolean, ErrorResult> removeDirSync = removeDirSync(kdbVar, jd9Var);
        ErrorResult d = removeDirSync.d();
        if (d != null) {
            p6cVar.O(d);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = removeDirSync.c();
        xhv xhvVar = xhv.INSTANCE;
        p6cVar.s1(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void removeFile(kdb kdbVar, bc9 bc9Var, p6c p6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a6776", new Object[]{this, kdbVar, bc9Var, p6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(bc9Var, "params");
        ckf.g(p6cVar, "callback");
        tao<Boolean, ErrorResult> removeFileSync = removeFileSync(kdbVar, bc9Var);
        ErrorResult d = removeFileSync.d();
        if (d != null) {
            p6cVar.O(d);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = removeFileSync.c();
        xhv xhvVar = xhv.INSTANCE;
        p6cVar.s1(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void rename(kdb kdbVar, ld9 ld9Var, v6c v6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7cde18", new Object[]{this, kdbVar, ld9Var, v6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ld9Var, "params");
        ckf.g(v6cVar, "callback");
        tao<String, ErrorResult> renameSync = renameSync(kdbVar, ld9Var);
        ErrorResult d = renameSync.d();
        if (d != null) {
            v6cVar.O(d);
            return;
        }
        FileRenameFileResult fileRenameFileResult = new FileRenameFileResult();
        fileRenameFileResult.savedFilePath = renameSync.c();
        xhv xhvVar = xhv.INSTANCE;
        v6cVar.v0(fileRenameFileResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void unzip(kdb kdbVar, bf9 bf9Var, w6c w6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d3f716", new Object[]{this, kdbVar, bf9Var, w6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(bf9Var, "params");
        ckf.g(w6cVar, "callback");
        tao<String, ErrorResult> unzipSync = unzipSync(kdbVar, bf9Var);
        ErrorResult d = unzipSync.d();
        if (d != null) {
            w6cVar.O(d);
            return;
        }
        FileUnzipResult fileUnzipResult = new FileUnzipResult();
        fileUnzipResult.path = unzipSync.c();
        xhv xhvVar = xhv.INSTANCE;
        w6cVar.M(fileUnzipResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void writeFile(kdb kdbVar, ih9 ih9Var, p6c p6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddbdd75", new Object[]{this, kdbVar, ih9Var, p6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ih9Var, "params");
        ckf.g(p6cVar, "callback");
        tao<Boolean, ErrorResult> writeFileSync = writeFileSync(kdbVar, ih9Var);
        ErrorResult d = writeFileSync.d();
        if (d != null) {
            p6cVar.O(d);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = writeFileSync.c();
        xhv xhvVar = xhv.INSTANCE;
        p6cVar.s1(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<Boolean, ErrorResult> existsSync(kdb kdbVar, bc9 bc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("9fbfdccd", new Object[]{this, kdbVar, bc9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(bc9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str = bc9Var.f16314a;
        ckf.f(str, "params.path");
        ErrorResult c = bvlVar.c(str);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str2 = bc9Var.f16314a;
        ckf.f(str2, "params.path");
        return new tao<>(Boolean.valueOf(gh9.INSTANCE.c(bvlVar.b(context, businessID, str2))), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<FileInfoResult, ErrorResult> getFileInfoSync(kdb kdbVar, qc9 qc9Var) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("983890c6", new Object[]{this, kdbVar, qc9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(qc9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str3 = qc9Var.f26667a;
        ckf.f(str3, "params.path");
        ErrorResult c = bvlVar.c(str3);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str4 = qc9Var.f26667a;
        ckf.f(str4, "params.path");
        String b = bvlVar.b(context, businessID, str4);
        File file = new File(b);
        if (!file.exists()) {
            return new tao<>(null, lc9.r(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (file.isDirectory()) {
            return new tao<>(null, lc9.x(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (!file.canRead()) {
            return new tao<>(null, lc9.b(lc9.INSTANCE, null, 1, null), 1, null);
        }
        FileInfoResult fileInfoResult = new FileInfoResult();
        bqo a2 = hpo.a(b);
        fileInfoResult.size = Double.valueOf(oc9.f(file));
        fileInfoResult.accessTime = Double.valueOf(a2.b);
        fileInfoResult.modifyTime = Double.valueOf(a2.c);
        if (file.isFile()) {
            str = "FILE";
        } else {
            str = "DIR";
        }
        fileInfoResult.type = str;
        String str5 = qc9Var.b;
        if (str5 != null) {
            int hashCode = str5.hashCode();
            if (hashCode != 76158) {
                if (hashCode == 2543909 && str5.equals("SHA1")) {
                    str2 = oc9.e(file);
                    if (str2 != null || str2.length() == 0) {
                        return new tao<>(null, lc9.f(lc9.INSTANCE, null, 1, null), 1, null);
                    }
                    fileInfoResult.digest = str2;
                }
                return new tao<>(null, lc9.h(lc9.INSTANCE, null, 1, null), 1, null);
            }
            if (str5.equals("MD5")) {
                str2 = oc9.d(file);
                if (str2 != null) {
                }
                return new tao<>(null, lc9.f(lc9.INSTANCE, null, 1, null), 1, null);
            }
            return new tao<>(null, lc9.h(lc9.INSTANCE, null, 1, null), 1, null);
        }
        return new tao<>(fileInfoResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<Boolean, ErrorResult> removeDirSync(kdb kdbVar, jd9 jd9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("4c95fcc0", new Object[]{this, kdbVar, jd9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(jd9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str = jd9Var.f21932a;
        ckf.f(str, "params.path");
        ErrorResult c = bvlVar.c(str);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str2 = jd9Var.f21932a;
        ckf.f(str2, "params.path");
        File file = new File(bvlVar.b(context, businessID, str2));
        if (!file.exists()) {
            return new tao<>(null, lc9.j(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (!file.isDirectory()) {
            return new tao<>(null, lc9.v(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (!file.canWrite()) {
            return new tao<>(null, lc9.d(lc9.INSTANCE, null, 1, null), 1, null);
        }
        long f = oc9.f(file);
        Context context2 = kdbVar.l().getContext();
        ckf.d(context2);
        zo7 a2 = ap7.a(context2, kdbVar.l().getBusinessID());
        if (!jd9Var.b) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                return new tao<>(null, lc9.n(lc9.INSTANCE, null, 1, null), 1, null);
            }
            if (!oc9.a(file)) {
                return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件夹删除失败", (Map) null, 4, (a07) null), 1, null);
            }
            a2.c(-f);
            return new tao<>(Boolean.TRUE, null, 2, null);
        } else if (!ph9.f(file)) {
            return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件夹删除失败", (Map) null, 4, (a07) null), 1, null);
        } else {
            a2.c(-f);
            return new tao<>(Boolean.TRUE, null, 2, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<Boolean, ErrorResult> removeFileSync(kdb kdbVar, bc9 bc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("e9a74e89", new Object[]{this, kdbVar, bc9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(bc9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str = bc9Var.f16314a;
        ckf.f(str, "params.path");
        ErrorResult c = bvlVar.c(str);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str2 = bc9Var.f16314a;
        ckf.f(str2, "params.path");
        File file = new File(bvlVar.b(context, businessID, str2));
        if (!file.exists()) {
            return new tao<>(null, lc9.r(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (file.isDirectory()) {
            return new tao<>(null, lc9.x(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (!file.canWrite()) {
            return new tao<>(null, lc9.d(lc9.INSTANCE, null, 1, null), 1, null);
        }
        Context context2 = kdbVar.l().getContext();
        ckf.d(context2);
        zo7 a2 = ap7.a(context2, kdbVar.l().getBusinessID());
        if (!oc9.a(file)) {
            return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件删除失败", (Map) null, 4, (a07) null), 1, null);
        }
        a2.c(-oc9.f(file));
        return new tao<>(Boolean.TRUE, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<String, ErrorResult> renameSync(kdb kdbVar, ld9 ld9Var) {
        boolean z;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("81497578", new Object[]{this, kdbVar, ld9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(ld9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str = ld9Var.f23270a;
        ckf.f(str, "params.src");
        ErrorResult c = bvlVar.c(str);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str2 = ld9Var.b;
        ckf.f(str2, "params.dest");
        ErrorResult c2 = bvlVar.c(str2);
        if (c2 != null) {
            return new tao<>(null, c2, 1, null);
        }
        String str3 = ld9Var.f23270a;
        ckf.f(str3, "params.src");
        String b = bvlVar.b(context, businessID, str3);
        String str4 = ld9Var.b;
        ckf.f(str4, "params.dest");
        String b2 = bvlVar.b(context, businessID, str4);
        File file = new File(b);
        if (!file.exists()) {
            return new tao<>(null, lc9.INSTANCE.q("指定的 src 文件不存在"), 1, null);
        }
        if (!file.canWrite()) {
            return new tao<>(null, lc9.INSTANCE.c("指定的 src 路径没有写权限"), 1, null);
        }
        File file2 = new File(b2);
        if (file2.exists() && file2.isFile()) {
            return new tao<>(null, lc9.INSTANCE.o("指定路径已存在文件"), 1, null);
        }
        File file3 = new File(gh9.INSTANCE.f(b2, b));
        if (file3.exists()) {
            if (file3.isDirectory()) {
                File parentFile2 = file3.getParentFile();
                if ((parentFile2 == null || !parentFile2.exists()) && ((parentFile = file3.getParentFile()) == null || !parentFile.mkdirs())) {
                    return new tao<>(null, lc9.INSTANCE.c("指定的 destPath 路径没有写权限"), 1, null);
                }
                z = file.renameTo(new File(file3.getAbsolutePath() + wh6.DIR + file.getName()));
            } else if (file.isDirectory()) {
                return new tao<>(null, lc9.INSTANCE.w("src为目录时，destPath 必须为目录"), 1, null);
            } else {
                z = file.renameTo(file3);
            }
            if (z) {
                return new tao<>(ld9Var.b, null, 2, null);
            }
            return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件重命名失败", (Map) null, 4, (a07) null), 1, null);
        } else if (file.renameTo(file3)) {
            return new tao<>(ld9Var.b, null, 2, null);
        } else {
            return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件重命名失败", (Map) null, 4, (a07) null), 1, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<Boolean, ErrorResult> appendFileSync(kdb kdbVar, ih9 ih9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("69509c7b", new Object[]{this, kdbVar, ih9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(ih9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str = ih9Var.f21308a;
        ckf.f(str, "params.path");
        ErrorResult c = bvlVar.c(str);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str2 = ih9Var.f21308a;
        ckf.f(str2, "params.path");
        if (tsq.w(str2, "/", false, 2, null)) {
            return new tao<>(null, lc9.INSTANCE.w("指定的 path 路径不能以 / 结尾"), 1, null);
        }
        String str3 = ih9Var.f21308a;
        ckf.f(str3, "params.path");
        String b = bvlVar.b(context, businessID, str3);
        String str4 = ih9Var.b;
        String str5 = ih9Var.c;
        ckf.f(str5, "params.encoding");
        ExecuteResult b2 = b(kdbVar, b, str4, null, str5, true);
        if (b2 instanceof ErrorResult) {
            return new tao<>(null, (c3c) b2, 1, null);
        }
        return new tao<>(Boolean.TRUE, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<List<FileItem>, ErrorResult> getDirInfoSync(kdb kdbVar, bc9 bc9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ada93ee4", new Object[]{this, kdbVar, bc9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(bc9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str2 = bc9Var.f16314a;
        ckf.f(str2, "params.path");
        ErrorResult c = bvlVar.c(str2);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str3 = bc9Var.f16314a;
        ckf.f(str3, "params.path");
        File file = new File(bvlVar.b(context, businessID, str3));
        if (!file.exists()) {
            return new tao<>(null, lc9.j(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (!file.isDirectory()) {
            return new tao<>(null, lc9.v(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (!file.canRead()) {
            return new tao<>(null, lc9.b(lc9.INSTANCE, null, 1, null), 1, null);
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                ckf.f(file2, "file");
                bqo a2 = hpo.a(file2.getPath());
                FileItem fileItem = new FileItem();
                fileItem.size = Double.valueOf(a2.f16554a);
                fileItem.name = file2.getName();
                fileItem.modifyTime = Double.valueOf(a2.c);
                fileItem.accessTime = Double.valueOf(a2.b);
                if (file2.isFile()) {
                    str = "FILE";
                } else {
                    str = "DIR";
                }
                fileItem.type = str;
                xhv xhvVar = xhv.INSTANCE;
                arrayList.add(fileItem);
            }
        }
        return new tao<>(arrayList, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<Boolean, ErrorResult> writeFileSync(kdb kdbVar, ih9 ih9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("341c0e00", new Object[]{this, kdbVar, ih9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(ih9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str = ih9Var.f21308a;
        ckf.f(str, "params.path");
        ErrorResult c = bvlVar.c(str);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str2 = ih9Var.f21308a;
        ckf.f(str2, "params.path");
        if (tsq.w(str2, "/", false, 2, null)) {
            return new tao<>(null, lc9.INSTANCE.w("指定的 path 路径不能以 / 结尾"), 1, null);
        }
        String str3 = ih9Var.f21308a;
        ckf.f(str3, "params.path");
        String b = bvlVar.b(context, businessID, str3);
        String str4 = ih9Var.b;
        String str5 = ih9Var.c;
        ckf.f(str5, "params.encoding");
        ExecuteResult b2 = b(kdbVar, b, str4, null, str5, false);
        if (b2 instanceof ErrorResult) {
            return new tao<>(null, (c3c) b2, 1, null);
        }
        return new tao<>(Boolean.TRUE, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<Boolean, ErrorResult> makeDirSync(kdb kdbVar, uc9 uc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("f47e1dc0", new Object[]{this, kdbVar, uc9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(uc9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str = uc9Var.f29290a;
        ckf.f(str, "params.path");
        ErrorResult c = bvlVar.c(str);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str2 = uc9Var.f29290a;
        ckf.f(str2, "params.path");
        File file = new File(bvlVar.b(context, businessID, str2));
        if (file.exists()) {
            return new tao<>(null, lc9.p(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (uc9Var.b) {
            try {
                if (file.mkdirs()) {
                    return new tao<>(Boolean.TRUE, null, 2, null);
                }
                return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (a07) null), 1, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("FileAbility", "mkdir error：".concat(sm8.b(th)));
                return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (a07) null), 1, null);
            }
        } else {
            try {
                File file2 = new File(bvlVar.a(context, businessID));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File parentFile = file.getParentFile();
                if (parentFile == null || !parentFile.exists()) {
                    return new tao<>(null, lc9.A(lc9.INSTANCE, null, 1, null), 1, null);
                }
                File parentFile2 = file.getParentFile();
                if (parentFile2 == null || !parentFile2.canWrite()) {
                    return new tao<>(null, lc9.d(lc9.INSTANCE, null, 1, null), 1, null);
                }
                try {
                    if (file.mkdir()) {
                        return new tao<>(Boolean.TRUE, null, 2, null);
                    }
                    return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (a07) null), 1, null);
                } catch (Throwable th2) {
                    iih.INSTANCE.a("FileAbility", "mkdir error：".concat(sm8.b(th2)));
                    return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (a07) null), 1, null);
                }
            } catch (Throwable th3) {
                iih.INSTANCE.a("FileAbility", "mkdir error：".concat(sm8.b(th3)));
                return new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (a07) null), 1, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.Closeable, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [tb.k2d] */
    /* JADX WARN: Type inference failed for: r2v6, types: [tb.k2d] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.tao<java.lang.Boolean, com.alibaba.ability.result.ErrorResult> copyFileSync(tb.kdb r20, tb.dc9 r21) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.file.FileAbility.copyFileSync(tb.kdb, tb.dc9):tb.tao");
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.zip.ZipInputStream, T] */
    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<String, ErrorResult> unzipSync(kdb kdbVar, bf9 bf9Var) {
        String str;
        Throwable th;
        lqx b;
        Throwable th2;
        String str2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("34969440", new Object[]{this, kdbVar, bf9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(bf9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str3 = bf9Var.f16352a;
        ckf.f(str3, "params.zipFilePath");
        ErrorResult c = bvlVar.c(str3);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str4 = bf9Var.b;
        ckf.f(str4, "params.targetPath");
        ErrorResult c2 = bvlVar.c(str4);
        if (c2 != null) {
            return new tao<>(null, c2, 1, null);
        }
        String str5 = bf9Var.f16352a;
        ckf.f(str5, "params.zipFilePath");
        String b2 = bvlVar.b(context, businessID, str5);
        String str6 = bf9Var.b;
        ckf.f(str6, "params.targetPath");
        String b3 = bvlVar.b(context, businessID, str6);
        File file = new File(b2);
        if (!file.exists()) {
            lc9 lc9Var = lc9.INSTANCE;
            return new tao<>(null, lc9Var.q("源文件不存在 " + b2), 1, null);
        } else if (file.isDirectory()) {
            lc9 lc9Var2 = lc9.INSTANCE;
            return new tao<>(null, lc9Var2.y("源文件是一个目录 " + b2), 1, null);
        } else if (!file.canRead()) {
            lc9 lc9Var3 = lc9.INSTANCE;
            return new tao<>(null, lc9Var3.a("源文件没有读权限 " + b2), 1, null);
        } else {
            File file2 = new File(b3);
            if (!file2.exists()) {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            } else if (!file2.canWrite()) {
                lc9 lc9Var4 = lc9.INSTANCE;
                return new tao<>(null, lc9Var4.c("指定目标文件路径没有写权限 " + b3), 1, null);
            }
            Context context2 = kdbVar.l().getContext();
            ckf.d(context2);
            zo7 a2 = ap7.a(context2, kdbVar.l().getBusinessID());
            try {
                b = lqx.Companion.b(b2);
            } catch (Throwable th4) {
                th = th4;
                str = "未知错误: ";
            }
            if (!b.d()) {
                return new tao<>(null, lc9.INSTANCE.y("源文件不是zip类型"), 1, null);
            }
            if (b.b()) {
                return new tao<>(null, ErrorResult.a.Companion.g("file path contains relative parent path"), 1, null);
            }
            if (b.a() > MAX_FILE_SIZE || b.c() > MAX_FILE_SIZE) {
                str = "未知错误: ";
                try {
                    return new tao<>(null, lc9.INSTANCE.s("单个文件超限"), 1, null);
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                long c3 = b.c();
                String str7 = "未知错误: ";
                try {
                    if (!a2.a(b.c())) {
                        return new tao<>(null, lc9.INSTANCE.k("文件夹超限"), 1, null);
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = null;
                    byte[] b4 = k2d.INSTANCE.b(2048);
                    if (!tsq.w(b3, "/", false, 2, null)) {
                        b3 = b3.concat("/");
                    }
                    try {
                        ref$ObjectRef.element = new ZipInputStream(new BufferedInputStream(new FileInputStream(b2)));
                        Iterator it = acp.g(new FileAbility$unzipSync$5(ref$ObjectRef)).iterator();
                        while (it.hasNext()) {
                            ZipEntry zipEntry = (ZipEntry) it.next();
                            String name = zipEntry.getName();
                            ckf.f(name, "zipEntry.name");
                            if (!TextUtils.isEmpty(name)) {
                                a2 = a2;
                                str7 = str7;
                                try {
                                    if (!tsq.I(name, "../", false, 2, null) && !tsq.w(name, "/..", false, 2, null) && !wsq.O(name, "/../", false, 2, null)) {
                                        File file3 = new File(b3 + name);
                                        if (zipEntry.isDirectory()) {
                                            file3.mkdirs();
                                        } else {
                                            File parentFile2 = file3.getParentFile();
                                            if (parentFile2 != null) {
                                                if (!parentFile2.exists()) {
                                                    parentFile2.mkdirs();
                                                }
                                                try {
                                                    fileOutputStream = new FileOutputStream(file3);
                                                    while (true) {
                                                        try {
                                                            int read = ((ZipInputStream) ref$ObjectRef.element).read(b4);
                                                            if (read <= 0) {
                                                                break;
                                                            }
                                                            fileOutputStream.write(b4, 0, read);
                                                        } catch (Throwable th6) {
                                                            th3 = th6;
                                                            k2d.INSTANCE.a(fileOutputStream);
                                                            throw th3;
                                                        }
                                                    }
                                                    k2d.INSTANCE.a(fileOutputStream);
                                                } catch (Throwable th7) {
                                                    th3 = th7;
                                                    fileOutputStream = null;
                                                }
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                                            }
                                        }
                                    }
                                    it = it;
                                    str7 = str7;
                                    a2 = a2;
                                } catch (Throwable th8) {
                                    th2 = th8;
                                    try {
                                        iih iihVar = iih.INSTANCE;
                                        iihVar.a("FileAbility", "unzip error：" + sm8.b(th2));
                                        a2.c(-c3);
                                        String valueOf = String.valueOf(1000);
                                        return new tao<>(null, new ErrorResult(valueOf, str7 + th2.getMessage(), (Map) null, 4, (a07) null), 1, null);
                                    } finally {
                                        k2d k2dVar = k2d.INSTANCE;
                                        k2dVar.e(b4);
                                        k2dVar.a((ZipInputStream) ref$ObjectRef.element);
                                    }
                                }
                            }
                        }
                        String str8 = bf9Var.b;
                        ckf.f(str8, "params.targetPath");
                        if (tsq.w(str8, "/", false, 2, null)) {
                            String str9 = bf9Var.b;
                            ckf.f(str9, "params.targetPath");
                            str2 = str9.substring(0, bf9Var.b.length() - 1);
                            ckf.f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        } else {
                            str2 = bf9Var.b;
                            ckf.f(str2, "params.targetPath");
                        }
                        return new tao<>(str2, null, 2, null);
                    } catch (Throwable th9) {
                        th2 = th9;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    str = str7;
                }
            }
            iih.INSTANCE.a("FileAbility", "unzip error：".concat(sm8.b(th)));
            String valueOf2 = String.valueOf(1000);
            return new tao<>(null, new ErrorResult(valueOf2, str + th.getMessage(), (Map) null, 4, (a07) null), 1, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public tao<String, ErrorResult> readAsStringSync(kdb kdbVar, gd9 gd9Var) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        tao<String, ErrorResult> taoVar;
        k2d k2dVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("e177ec42", new Object[]{this, kdbVar, gd9Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(gd9Var, "params");
        String businessID = kdbVar.l().getBusinessID();
        Context context = kdbVar.l().getContext();
        Closeable closeable = null;
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("context is null"), 1, null);
        }
        bvl bvlVar = bvl.INSTANCE;
        String str2 = gd9Var.f19911a;
        ckf.f(str2, "params.path");
        ErrorResult c = bvlVar.c(str2);
        if (c != null) {
            return new tao<>(null, c, 1, null);
        }
        String str3 = gd9Var.f19911a;
        ckf.f(str3, "params.path");
        String b = bvlVar.b(context, businessID, str3);
        File file = new File(b);
        if (!file.exists()) {
            return new tao<>(null, lc9.r(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (file.isDirectory()) {
            return new tao<>(null, lc9.x(lc9.INSTANCE, null, 1, null), 1, null);
        }
        if (!file.canRead()) {
            return new tao<>(null, lc9.b(lc9.INSTANCE, null, 1, null), 1, null);
        }
        ljn ljnVar = ljn.INSTANCE;
        ljnVar.a(b);
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    k2dVar = k2d.INSTANCE;
                    byte[] d = k2dVar.d(fileInputStream);
                    if (d != null) {
                        String str4 = gd9Var.b;
                        int hashCode = str4.hashCode();
                        if (hashCode == 71419) {
                            if (str4.equals("HEX")) {
                                str = wva.INSTANCE.a(d);
                                tao<String, ErrorResult> taoVar2 = new tao<>(str, null, 2, null);
                                ljnVar.d(b);
                                k2dVar.a(fileInputStream);
                                return taoVar2;
                            }
                            String str5 = gd9Var.b;
                            ckf.f(str5, "params.encoding");
                            Charset forName = Charset.forName(a(str5));
                            ckf.f(forName, "Charset.forName(convertEncoding(params.encoding))");
                            str = new String(d, forName);
                            tao<String, ErrorResult> taoVar22 = new tao<>(str, null, 2, null);
                            ljnVar.d(b);
                            k2dVar.a(fileInputStream);
                            return taoVar22;
                        } else if (hashCode != 1952093519) {
                            if (hashCode == 1959329793 && str4.equals("BINARY")) {
                                str = new String(d, uj3.UTF_8);
                                tao<String, ErrorResult> taoVar222 = new tao<>(str, null, 2, null);
                                ljnVar.d(b);
                                k2dVar.a(fileInputStream);
                                return taoVar222;
                            }
                            String str52 = gd9Var.b;
                            ckf.f(str52, "params.encoding");
                            Charset forName2 = Charset.forName(a(str52));
                            ckf.f(forName2, "Charset.forName(convertEncoding(params.encoding))");
                            str = new String(d, forName2);
                            tao<String, ErrorResult> taoVar2222 = new tao<>(str, null, 2, null);
                            ljnVar.d(b);
                            k2dVar.a(fileInputStream);
                            return taoVar2222;
                        } else {
                            if (str4.equals("BASE64")) {
                                str = Base64.encodeToString(d, 2);
                                if (str != null) {
                                    tao<String, ErrorResult> taoVar22222 = new tao<>(str, null, 2, null);
                                    ljnVar.d(b);
                                    k2dVar.a(fileInputStream);
                                    return taoVar22222;
                                }
                                taoVar = new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误", (Map) null, 4, (a07) null), 1, null);
                            }
                            String str522 = gd9Var.b;
                            ckf.f(str522, "params.encoding");
                            Charset forName22 = Charset.forName(a(str522));
                            ckf.f(forName22, "Charset.forName(convertEncoding(params.encoding))");
                            str = new String(d, forName22);
                            tao<String, ErrorResult> taoVar222222 = new tao<>(str, null, 2, null);
                            ljnVar.d(b);
                            k2dVar.a(fileInputStream);
                            return taoVar222222;
                        }
                    } else {
                        taoVar = new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误", (Map) null, 4, (a07) null), 1, null);
                    }
                    ljnVar.d(b);
                } catch (Exception e2) {
                    e = e2;
                    iih.INSTANCE.a("FileAbility", "read file as string error：".concat(sm8.b(e)));
                    taoVar = new tao<>(null, new ErrorResult(String.valueOf(1000), "未知错误, " + e.getMessage(), (Map) null, 4, (a07) null), 1, null);
                    ljn.INSTANCE.d(b);
                    k2dVar = k2d.INSTANCE;
                    k2dVar.a(fileInputStream);
                    return taoVar;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = "params.path";
                ljn.INSTANCE.d(b);
                k2d.INSTANCE.a(closeable);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            ljn.INSTANCE.d(b);
            k2d.INSTANCE.a(closeable);
            throw th;
        }
        k2dVar.a(fileInputStream);
        return taoVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0133, code lost:
        if (r6.equals("DirectArrayBuffer") != false) goto L_0x0135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150 A[Catch: Exception -> 0x010d, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:58:0x00dd, B:60:0x00e6, B:63:0x00f9, B:66:0x0103, B:69:0x0111, B:71:0x0119, B:72:0x011e, B:75:0x0128, B:76:0x012d, B:79:0x0137, B:81:0x013f, B:82:0x0146, B:84:0x0150), top: B:139:0x00dd }] */
    /* JADX WARN: Type inference failed for: r11v3, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.ExecuteResult b(tb.kdb r23, java.lang.String r24, java.lang.String r25, java.nio.ByteBuffer r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.file.FileAbility.b(tb.kdb, java.lang.String, java.lang.String, java.nio.ByteBuffer, java.lang.String, boolean):com.alibaba.ability.result.ExecuteResult");
    }
}
