package com.alibaba.alibity.container.file;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.weex.common.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.a07;
import tb.acp;
import tb.ckf;
import tb.f4w;
import tb.gh9;
import tb.gpe;
import tb.hdb;
import tb.jpu;
import tb.k2d;
import tb.kc9;
import tb.kdb;
import tb.ljn;
import tb.lqx;
import tb.oc9;
import tb.pg1;
import tb.ph9;
import tb.tsq;
import tb.uj3;
import tb.v3i;
import tb.vq;
import tb.vs3;
import tb.wsq;
import tb.wva;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FileAbility implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_APPEND_FILE = "appendFile";
    public static final String API_COPY_FILE = "copyFile";
    public static final String API_EXISTS = "exists";
    public static final String API_GET_DIR_INFO = "getDirInfo";
    public static final String API_GET_FILE_INFO = "getFileInfo";
    public static final String API_MAKE_DIR = "makeDir";
    public static final String API_READ_AS_ARRAY_BUFFER = "readAsBuffer";
    public static final String API_READ_AS_STRING = "readAsString";
    public static final String API_REMOVE_DIR = "removeDir";
    public static final String API_REMOVE_FILE = "removeFile";
    public static final String API_RENAME = "rename";
    public static final String API_UNZIP = "unzip";
    public static final String API_WRITE_FILE = "writeFile";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ kdb c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ vq e;

        public b(String str, kdb kdbVar, Map map, vq vqVar) {
            this.b = str;
            this.c = kdbVar;
            this.d = map;
            this.e = vqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Log.e("FileAbility", "execute api: " + this.b);
            ExecuteResult b = FileAbility.b(FileAbility.this, this.b, this.c, this.d);
            if (b instanceof FinishResult) {
                this.e.c((FinishResult) b);
            } else if (b instanceof ErrorResult) {
                this.e.b((ErrorResult) b);
            } else if (b instanceof ExecutingResult) {
                this.e.d((ExecutingResult) b);
            } else {
                this.e.b(new ErrorResult("500", "内部未知错误", (Map) null, 4, (a07) null));
            }
        }
    }

    public static final /* synthetic */ ExecuteResult b(FileAbility fileAbility, String str, kdb kdbVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("7877a3f0", new Object[]{fileAbility, str, kdbVar, map});
        }
        return fileAbility.c(str, kdbVar, map);
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d10349", new Object[]{this, str});
        }
        return TextUtils.isEmpty(str) ? str : (TextUtils.equals(str, "ucs2") || TextUtils.equals(str, "ucs-2") || TextUtils.equals(str, "utf16le") || TextUtils.equals(str, "utf-16le")) ? "UTF-16LE" : str;
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        MegaUtils.C(new b(str, kdbVar, map, vqVar));
        return null;
    }

    public final ExecuteResult a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("41348daa", new Object[]{this, str});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        gh9 gh9Var = gh9.INSTANCE;
        if (gh9Var.a(str)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        if (gh9Var.c(str)) {
            return new FinishResult(null, "success", 1, null);
        }
        return kc9.n(kc9.INSTANCE, null, 1, null);
    }

    public final ExecuteResult h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("acc3762b", new Object[]{this, str, new Boolean(z)});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        if (gh9.INSTANCE.a(str)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        if (file.exists()) {
            return kc9.l(kc9.INSTANCE, null, 1, null);
        }
        if (!z) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                return kc9.v(kc9.INSTANCE, null, 1, null);
            }
            File parentFile2 = file.getParentFile();
            if (parentFile2 == null || !parentFile2.canWrite()) {
                return kc9.d(kc9.INSTANCE, null, 1, null);
            }
            if (file.mkdir()) {
                return new FinishResult(null, "success", 1, null);
            }
            return new ErrorResult(String.valueOf(499), "未知错误，文件夹创建失败", (Map) null, 4, (a07) null);
        } else if (file.mkdirs()) {
            return new FinishResult(null, "success", 1, null);
        } else {
            return new ErrorResult(String.valueOf(499), "未知错误，文件夹创建失败", (Map) null, 4, (a07) null);
        }
    }

    public final ExecuteResult m(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("9c373c6e", new Object[]{this, str, new Boolean(z)});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        if (gh9.INSTANCE.a(str)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return kc9.n(kc9.INSTANCE, null, 1, null);
        }
        if (!file.isDirectory()) {
            return kc9.r(kc9.INSTANCE, null, 1, null);
        }
        if (!file.canWrite()) {
            return kc9.d(kc9.INSTANCE, null, 1, null);
        }
        if (!z) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                return kc9.j(kc9.INSTANCE, null, 1, null);
            }
            if (oc9.a(file)) {
                return new FinishResult(null, "success", 1, null);
            }
            return new ErrorResult(String.valueOf(499), "未知错误，文件夹删除失败", (Map) null, 4, (a07) null);
        } else if (ph9.f(file)) {
            return new FinishResult(null, "success", 1, null);
        } else {
            return new ErrorResult(String.valueOf(499), "未知错误，文件夹删除失败", (Map) null, 4, (a07) null);
        }
    }

    public final ExecuteResult n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("bf139f1b", new Object[]{this, str});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        if (gh9.INSTANCE.a(str)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return kc9.n(kc9.INSTANCE, null, 1, null);
        }
        if (file.isDirectory()) {
            return kc9.t(kc9.INSTANCE, null, 1, null);
        }
        if (!file.canWrite()) {
            return kc9.d(kc9.INSTANCE, null, 1, null);
        }
        if (oc9.a(file)) {
            return new FinishResult(null, "success", 1, null);
        }
        return new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
    }

    public final ExecuteResult f(String str, String str2) {
        FileOutputStream fileOutputStream;
        Exception e;
        ExecuteResult errorResult;
        k2d k2dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("86e260d3", new Object[]{this, str, str2});
        }
        if (str.length() == 0 || str2.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        gh9 gh9Var = gh9.INSTANCE;
        if (gh9Var.a(str) || gh9Var.a(str2)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return kc9.INSTANCE.m("指定的 srcPath 文件不存在");
        }
        if (file.isDirectory()) {
            return kc9.INSTANCE.s("指定的 srcPath 是一个已经存在的目录");
        }
        if (!file.canRead()) {
            return kc9.INSTANCE.a("指定的 srcPath 路径没有读权限");
        }
        File file2 = new File(str2);
        if (!file2.exists()) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.canWrite()) {
                return kc9.INSTANCE.c("指定的 destPath 路径没有写权限");
            }
        } else if (file2.isDirectory()) {
            file2 = new File(str2 + "/" + file.getName());
        } else if (!file2.canWrite()) {
            return kc9.INSTANCE.c("指定的 destPath 路径没有写权限");
        }
        ljn ljnVar = ljn.INSTANCE;
        ljnVar.a(str);
        ljnVar.c(str2);
        byte[] b2 = k2d.INSTANCE.b(2048);
        ckf.f(b2, "IOUtils.INSTANCE.getBuf(IOUtils.IO_BUFFER_SIZE)");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int read = fileInputStream2.read(b2);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(b2, 0, read);
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        try {
                            errorResult = new ErrorResult(String.valueOf(499), "未知错误: " + e.getMessage(), (Map) null, 4, (a07) null);
                            ljn ljnVar2 = ljn.INSTANCE;
                            ljnVar2.d(str);
                            ljnVar2.d(str);
                            k2dVar = k2d.INSTANCE;
                            k2dVar.e(b2);
                            k2dVar.a(fileInputStream);
                            k2dVar.a(fileOutputStream);
                            return errorResult;
                        } catch (Throwable th) {
                            th = th;
                            ljn ljnVar3 = ljn.INSTANCE;
                            ljnVar3.d(str);
                            ljnVar3.d(str);
                            k2d k2dVar2 = k2d.INSTANCE;
                            k2dVar2.e(b2);
                            k2dVar2.a(fileInputStream);
                            k2dVar2.a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        ljn ljnVar32 = ljn.INSTANCE;
                        ljnVar32.d(str);
                        ljnVar32.d(str);
                        k2d k2dVar22 = k2d.INSTANCE;
                        k2dVar22.e(b2);
                        k2dVar22.a(fileInputStream);
                        k2dVar22.a(fileOutputStream);
                        throw th;
                    }
                }
                errorResult = new FinishResult(null, "success", 1, null);
                ljn ljnVar4 = ljn.INSTANCE;
                ljnVar4.d(str);
                ljnVar4.d(str);
                k2dVar = k2d.INSTANCE;
                k2dVar.e(b2);
                k2dVar.a(fileInputStream2);
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        k2dVar.a(fileOutputStream);
        return errorResult;
    }

    public final ExecuteResult l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("544937c6", new Object[]{this, str, str2});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("oldPath is empty");
        }
        gh9 gh9Var = gh9.INSTANCE;
        if (gh9Var.a(str)) {
            return ErrorResult.a.Companion.g("oldPath contains relative parent path");
        }
        if (str2.length() == 0) {
            return ErrorResult.a.Companion.g("newPath is empty");
        }
        if (gh9Var.a(str2)) {
            return ErrorResult.a.Companion.g("newPath contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return kc9.INSTANCE.m("指定的 oldPath 文件不存在");
        }
        if (!file.canWrite()) {
            return kc9.INSTANCE.a("指定的 oldPath 路径没有写权限");
        }
        File file2 = new File(str2);
        if (file2.exists() && file2.isFile()) {
            return kc9.INSTANCE.k("指定路径已存在文件");
        }
        File file3 = new File(gh9Var.f(str2, str));
        File parentFile = file3.getParentFile();
        if (parentFile == null || !parentFile.canWrite()) {
            return kc9.INSTANCE.c("指定的 destPath 路径没有写权限");
        }
        if (file.renameTo(file3)) {
            return new FinishResult(v3i.f(jpu.a("savedFilePath", file3.getAbsolutePath())), null, 2, null);
        }
        return new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cd54ad0", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return yz3.m("ascii", "base64", gpe.BIN_TAG, "hex", "ucs2", "ucs-2", "utf16le", "utf-16le", "utf-8", "utf8", "latin1", "ArrayBuffer", "DirectArrayBuffer").contains(str);
    }

    public final ExecuteResult g(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("4e612584", new Object[]{this, str, str2});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        if (gh9.INSTANCE.a(str)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return kc9.n(kc9.INSTANCE, null, 1, null);
        }
        if (file.isDirectory()) {
            return kc9.t(kc9.INSTANCE, null, 1, null);
        }
        if (!file.canRead()) {
            return kc9.b(kc9.INSTANCE, null, 1, null);
        }
        int hashCode = str2.hashCode();
        if (hashCode != 107902) {
            if (hashCode == 3528965 && str2.equals("sha1")) {
                str3 = oc9.e(file);
                Log.e(API_GET_FILE_INFO, "fileDigest: " + str3);
                if (str3 != null || str3.length() == 0) {
                    return kc9.f(kc9.INSTANCE, null, 1, null);
                }
                return new FinishResult(kotlin.collections.a.j(jpu.a("size", Long.valueOf(oc9.f(file))), jpu.a(Constants.CodeCache.BANNER_DIGEST, str3)), null, 2, null);
            }
            return kc9.h(kc9.INSTANCE, null, 1, null);
        }
        if (str2.equals("md5")) {
            str3 = oc9.d(file);
            Log.e(API_GET_FILE_INFO, "fileDigest: " + str3);
            if (str3 != null) {
            }
            return kc9.f(kc9.INSTANCE, null, 1, null);
        }
        return kc9.h(kc9.INSTANCE, null, 1, null);
    }

    public final ExecuteResult k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("c54f1597", new Object[]{this, str});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        if (gh9.INSTANCE.a(str)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return kc9.n(kc9.INSTANCE, null, 1, null);
        }
        if (!file.isDirectory()) {
            return kc9.r(kc9.INSTANCE, null, 1, null);
        }
        if (!file.canRead()) {
            return kc9.b(kc9.INSTANCE, null, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                Pair a2 = jpu.a("size", String.valueOf(oc9.f(file2)));
                ckf.f(file2, "file");
                arrayList.add(kotlin.collections.a.j(a2, jpu.a(UploadConstants.FILE_NAME, file2.getName()), jpu.a("createTime", String.valueOf(oc9.b(file2)))));
            }
        }
        return new FinishResult(kotlin.collections.a.j(jpu.a(vs3.FILES_DIR_NAME, arrayList), jpu.a("type", "details")), "success");
    }

    public final ExecuteResult c(String str, kdb kdbVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("17b1b6f0", new Object[]{this, str, kdbVar, map});
        }
        String str2 = "ArrayBuffer";
        Object obj = null;
        switch (str.hashCode()) {
            case -2139808842:
                if (str.equals(API_APPEND_FILE)) {
                    Object obj2 = map.get("path");
                    if (!(obj2 instanceof String)) {
                        obj2 = null;
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        return ErrorResult.a.Companion.g("filePath is null");
                    }
                    Object obj3 = map.get("encoding");
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str4 = (String) obj3;
                    String str5 = str4 != null ? str4 : "utf8";
                    if (ckf.b(str5, "DirectArrayBuffer") || ckf.b(str5, str2)) {
                        Object obj4 = map.get("data");
                        if (obj4 instanceof ByteBuffer) {
                            obj = obj4;
                        }
                        ByteBuffer byteBuffer = (ByteBuffer) obj;
                        if (byteBuffer != null) {
                            return p(str3, null, byteBuffer, str5, true);
                        }
                        return ErrorResult.a.Companion.g(f4w.LOAD_DATA_NULL);
                    }
                    Object obj5 = map.get("data");
                    if (obj5 instanceof String) {
                        obj = obj5;
                    }
                    String str6 = (String) obj;
                    if (str6 != null) {
                        return p(str3, str6, null, str5, true);
                    }
                    return ErrorResult.a.Companion.g(f4w.LOAD_DATA_NULL);
                }
                break;
            case -1588426075:
                if (str.equals(API_GET_DIR_INFO)) {
                    Object obj6 = map.get("path");
                    if (obj6 instanceof String) {
                        obj = obj6;
                    }
                    String str7 = (String) obj;
                    if (str7 != null) {
                        return k(str7);
                    }
                    return ErrorResult.a.Companion.g("dirPath is null");
                }
                break;
            case -1406748165:
                if (str.equals(API_WRITE_FILE)) {
                    Object obj7 = map.get("path");
                    if (!(obj7 instanceof String)) {
                        obj7 = null;
                    }
                    String str8 = (String) obj7;
                    if (str8 == null) {
                        return ErrorResult.a.Companion.g("filePath is null");
                    }
                    Object obj8 = map.get("encoding");
                    if (!(obj8 instanceof String)) {
                        obj8 = null;
                    }
                    String str9 = (String) obj8;
                    String str10 = str9 != null ? str9 : "utf8";
                    if (!ckf.b(kdbVar.l().getNamespace(), TMSCalendarBridge.namespace) || (!ckf.b(str10, "DirectArrayBuffer") && !ckf.b(str10, str2))) {
                        Object obj9 = map.get("data");
                        if (obj9 instanceof String) {
                            obj = obj9;
                        }
                        String str11 = (String) obj;
                        if (str11 != null) {
                            return p(str8, str11, null, str10, false);
                        }
                        return ErrorResult.a.Companion.g(f4w.LOAD_DATA_NULL);
                    }
                    Object obj10 = map.get("data");
                    if (obj10 instanceof ByteBuffer) {
                        obj = obj10;
                    }
                    ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                    if (byteBuffer2 != null) {
                        return p(str8, null, byteBuffer2, str10, false);
                    }
                    return ErrorResult.a.Companion.g(f4w.LOAD_DATA_NULL);
                }
                break;
            case -1289358244:
                if (str.equals(API_EXISTS)) {
                    Object obj11 = map.get("path");
                    if (obj11 instanceof String) {
                        obj = obj11;
                    }
                    String str12 = (String) obj;
                    if (str12 != null) {
                        return a(str12);
                    }
                    return ErrorResult.a.Companion.g("path is null");
                }
                break;
            case -934594754:
                if (str.equals(API_RENAME)) {
                    Object obj12 = map.get("src");
                    if (!(obj12 instanceof String)) {
                        obj12 = null;
                    }
                    String str13 = (String) obj12;
                    if (str13 == null) {
                        return ErrorResult.a.Companion.g("oldPath is null");
                    }
                    Object obj13 = map.get("dest");
                    if (obj13 instanceof String) {
                        obj = obj13;
                    }
                    String str14 = (String) obj;
                    if (str14 != null) {
                        return l(str13, str14);
                    }
                    return ErrorResult.a.Companion.g("newPath is null");
                }
                break;
            case -506374511:
                if (str.equals(API_COPY_FILE)) {
                    Object obj14 = map.get("src");
                    if (!(obj14 instanceof String)) {
                        obj14 = null;
                    }
                    String str15 = (String) obj14;
                    if (str15 == null) {
                        return ErrorResult.a.Companion.g("srcPath is null");
                    }
                    Object obj15 = map.get("dest");
                    if (obj15 instanceof String) {
                        obj = obj15;
                    }
                    String str16 = (String) obj;
                    if (str16 != null) {
                        return f(str15, str16);
                    }
                    return ErrorResult.a.Companion.g("destPath is null");
                }
                break;
            case 111449576:
                if (str.equals(API_UNZIP)) {
                    Object obj16 = map.get("src");
                    if (!(obj16 instanceof String)) {
                        obj16 = null;
                    }
                    String str17 = (String) obj16;
                    if (str17 == null) {
                        return ErrorResult.a.Companion.g("zipFilePath is null");
                    }
                    Object obj17 = map.get("dest");
                    if (!(obj17 instanceof String)) {
                        obj17 = null;
                    }
                    String str18 = (String) obj17;
                    if (str18 == null) {
                        return ErrorResult.a.Companion.g("newPath is null");
                    }
                    Object obj18 = map.get("limitRootDicPath");
                    if (obj18 instanceof String) {
                        obj = obj18;
                    }
                    return o(str17, str18, (String) obj);
                }
                break;
            case 832575423:
                if (str.equals(API_MAKE_DIR)) {
                    Object obj19 = map.get("path");
                    if (!(obj19 instanceof String)) {
                        obj19 = null;
                    }
                    String str19 = (String) obj19;
                    if (str19 == null) {
                        return ErrorResult.a.Companion.g("dirPath is null");
                    }
                    Object obj20 = map.get("recursive");
                    if (obj20 instanceof Boolean) {
                        obj = obj20;
                    }
                    Boolean bool = (Boolean) obj;
                    return h(str19, bool != null ? bool.booleanValue() : false);
                }
                break;
            case 1086252744:
                if (str.equals(API_READ_AS_ARRAY_BUFFER)) {
                    Object obj21 = map.get("path");
                    if (!(obj21 instanceof String)) {
                        obj21 = null;
                    }
                    String str20 = (String) obj21;
                    if (str20 == null) {
                        return ErrorResult.a.Companion.g("filePath is null");
                    }
                    if (ckf.b(kdbVar.l().getNamespace(), TMSCalendarBridge.namespace)) {
                        Object obj22 = map.get("encoding");
                        if (obj22 instanceof String) {
                            obj = obj22;
                        }
                        String str21 = (String) obj;
                        if (str21 != null) {
                            str2 = str21;
                        }
                    }
                    return i(str20, str2);
                }
                break;
            case 1098154016:
                if (str.equals(API_REMOVE_FILE)) {
                    Object obj23 = map.get("path");
                    if (obj23 instanceof String) {
                        obj = obj23;
                    }
                    String str22 = (String) obj;
                    if (str22 != null) {
                        return n(str22);
                    }
                    return ErrorResult.a.Companion.g("filePath is null");
                }
                break;
            case 1282348393:
                if (str.equals(API_REMOVE_DIR)) {
                    Object obj24 = map.get("path");
                    if (!(obj24 instanceof String)) {
                        obj24 = null;
                    }
                    String str23 = (String) obj24;
                    if (str23 == null) {
                        return ErrorResult.a.Companion.g("dirPath is null");
                    }
                    Object obj25 = map.get("recursive");
                    if (obj25 instanceof Boolean) {
                        obj = obj25;
                    }
                    Boolean bool2 = (Boolean) obj;
                    return m(str23, bool2 != null ? bool2.booleanValue() : false);
                }
                break;
            case 1342041536:
                if (str.equals(API_GET_FILE_INFO)) {
                    Object obj26 = map.get("path");
                    if (!(obj26 instanceof String)) {
                        obj26 = null;
                    }
                    String str24 = (String) obj26;
                    if (str24 == null) {
                        return ErrorResult.a.Companion.g("filePath is null");
                    }
                    Object obj27 = map.get("digestAlgorithm");
                    if (obj27 instanceof String) {
                        obj = obj27;
                    }
                    String str25 = (String) obj;
                    if (str25 == null) {
                        str25 = "md5";
                    }
                    return g(str24, str25);
                }
                break;
            case 1572385433:
                if (str.equals(API_READ_AS_STRING)) {
                    Object obj28 = map.get("path");
                    if (!(obj28 instanceof String)) {
                        obj28 = null;
                    }
                    String str26 = (String) obj28;
                    if (str26 == null) {
                        return ErrorResult.a.Companion.g("filePath is null");
                    }
                    Object obj29 = map.get("encoding");
                    if (obj29 instanceof String) {
                        obj = obj29;
                    }
                    String str27 = (String) obj;
                    if (str27 == null) {
                        str27 = gpe.BIN_TAG;
                    }
                    return j(str26, str27);
                }
                break;
        }
        return ErrorResult.a.Companion.a("未找到对应的文件API");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.alibaba.ability.result.ErrorResult] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final ExecuteResult i(String str, String str2) {
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        String str3 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("fb649d7c", new Object[]{this, str3, str2});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        if (gh9.INSTANCE.a(str3)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File((String) str3);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return kc9.n(kc9.INSTANCE, null, 1, null);
        }
        if (file.isDirectory()) {
            return kc9.t(kc9.INSTANCE, null, 1, null);
        }
        if (!file.canRead()) {
            return kc9.b(kc9.INSTANCE, null, 1, null);
        }
        if (!ckf.b(str2, "ArrayBuffer") && !ckf.b(str2, "DirectArrayBuffer")) {
            return ErrorResult.a.Companion.g(null);
        }
        ljn ljnVar = ljn.INSTANCE;
        ljnVar.a(str3);
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            int hashCode = str2.hashCode();
            if (hashCode != 1022819376) {
                if (hashCode == 1906553817 && str2.equals("ArrayBuffer")) {
                    k2d k2dVar = k2d.INSTANCE;
                    byte[] d = k2dVar.d(fileInputStream);
                    if (d != null) {
                        FinishResult finishResult = new FinishResult(kotlin.collections.a.j(jpu.a("data", ByteBuffer.wrap(d)), jpu.a("dataType", "ByteBuffer")), null, 2, null);
                        ljnVar.d(str3);
                        k2dVar.a(fileInputStream);
                        return finishResult;
                    }
                    ErrorResult errorResult = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
                    ljnVar.d(str3);
                    k2dVar.a(fileInputStream);
                    return errorResult;
                }
            } else if (str2.equals("DirectArrayBuffer")) {
                FileChannel channel = fileInputStream.getChannel();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) channel.size());
                channel.read(allocateDirect);
                FinishResult finishResult2 = new FinishResult(kotlin.collections.a.j(jpu.a("data", allocateDirect), jpu.a("dataType", "ByteBuffer")), null, 2, null);
                ljnVar.d(str3);
                k2d.INSTANCE.a(fileInputStream);
                return finishResult2;
            }
            ljnVar.d(str3);
            k2d.INSTANCE.a(fileInputStream);
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            ljn.INSTANCE.d(str3);
            k2d.INSTANCE.a(fileInputStream2);
            str3 = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
            return str3;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            ljn.INSTANCE.d(str3);
            k2d.INSTANCE.a(fileInputStream2);
            throw th;
        }
        str3 = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
        return str3;
    }

    public final ExecuteResult j(String str, String str2) {
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        k2d k2dVar;
        ErrorResult errorResult;
        FinishResult finishResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("6589d5cb", new Object[]{this, str, str2});
        }
        if (str.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        if (gh9.INSTANCE.a(str)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return kc9.n(kc9.INSTANCE, null, 1, null);
        }
        if (file.isDirectory()) {
            return kc9.t(kc9.INSTANCE, null, 1, null);
        }
        if (!file.canRead()) {
            return kc9.b(kc9.INSTANCE, null, 1, null);
        }
        if (!d(str2)) {
            return ErrorResult.a.Companion.g("encoding is invalid");
        }
        ljn ljnVar = ljn.INSTANCE;
        ljnVar.a(str);
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int hashCode = str2.hashCode();
            if (hashCode == -1396204209) {
                if (str2.equals("base64")) {
                    k2dVar = k2d.INSTANCE;
                    byte[] d = k2dVar.d(fileInputStream);
                    if (d != null) {
                        String encodeToString = Base64.encodeToString(d, 2);
                        if (encodeToString != null) {
                            finishResult = new FinishResult(kotlin.collections.a.j(jpu.a("data", encodeToString), jpu.a("dataType", pg1.ATOM_String)), null, 2, null);
                            ljnVar.d(str);
                            k2dVar.a(fileInputStream);
                            return finishResult;
                        }
                        errorResult = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
                    } else {
                        errorResult = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
                    }
                    ljnVar.d(str);
                    k2dVar.a(fileInputStream);
                    return errorResult;
                }
                k2d k2dVar2 = k2d.INSTANCE;
                FinishResult finishResult2 = new FinishResult(kotlin.collections.a.j(jpu.a("data", new String(k2dVar2.d(fileInputStream), e(str2))), jpu.a("dataType", pg1.ATOM_String)), null, 2, null);
                ljnVar.d(str);
                k2dVar2.a(fileInputStream);
                return finishResult2;
            } else if (hashCode != -1388966911) {
                if (hashCode == 103195 && str2.equals("hex")) {
                    k2dVar = k2d.INSTANCE;
                    byte[] d2 = k2dVar.d(fileInputStream);
                    if (d2 != null) {
                        String a2 = wva.INSTANCE.a(d2);
                        ckf.f(a2, "HexUtils.INSTANCE.byteArrayToHex(binaryData)");
                        finishResult = new FinishResult(kotlin.collections.a.j(jpu.a("data", a2), jpu.a("dataType", pg1.ATOM_String)), null, 2, null);
                        ljnVar.d(str);
                        k2dVar.a(fileInputStream);
                        return finishResult;
                    }
                    errorResult = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
                    ljnVar.d(str);
                    k2dVar.a(fileInputStream);
                    return errorResult;
                }
                k2d k2dVar22 = k2d.INSTANCE;
                FinishResult finishResult22 = new FinishResult(kotlin.collections.a.j(jpu.a("data", new String(k2dVar22.d(fileInputStream), e(str2))), jpu.a("dataType", pg1.ATOM_String)), null, 2, null);
                ljnVar.d(str);
                k2dVar22.a(fileInputStream);
                return finishResult22;
            } else {
                if (str2.equals(gpe.BIN_TAG)) {
                    k2dVar = k2d.INSTANCE;
                    byte[] d3 = k2dVar.d(fileInputStream);
                    if (d3 != null) {
                        FinishResult finishResult3 = new FinishResult(kotlin.collections.a.j(jpu.a("data", new String(d3, uj3.UTF_8)), jpu.a("dataType", pg1.ATOM_String)), null, 2, null);
                        ljnVar.d(str);
                        k2dVar.a(fileInputStream);
                        return finishResult3;
                    }
                    errorResult = new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
                    ljnVar.d(str);
                    k2dVar.a(fileInputStream);
                    return errorResult;
                }
                k2d k2dVar222 = k2d.INSTANCE;
                FinishResult finishResult222 = new FinishResult(kotlin.collections.a.j(jpu.a("data", new String(k2dVar222.d(fileInputStream), e(str2))), jpu.a("dataType", pg1.ATOM_String)), null, 2, null);
                ljnVar.d(str);
                k2dVar222.a(fileInputStream);
                return finishResult222;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            ljn.INSTANCE.d(str);
            k2d.INSTANCE.a(fileInputStream2);
            return new ErrorResult(String.valueOf(499), "未知错误", (Map) null, 4, (a07) null);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            ljn.INSTANCE.d(str);
            k2d.INSTANCE.a(fileInputStream2);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.zip.ZipInputStream, T] */
    public final ExecuteResult o(String str, String str2, String str3) {
        Object obj;
        Throwable th;
        Throwable th2;
        lqx b2;
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("de40b692", new Object[]{this, str, str2, str3});
        }
        if (str.length() == 0 || str2.length() == 0) {
            return ErrorResult.a.Companion.g("file path is empty");
        }
        gh9 gh9Var = gh9.INSTANCE;
        if (gh9Var.a(str) || gh9Var.a(str2)) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        File file = new File(str);
        if (!file.exists()) {
            return kc9.INSTANCE.m("源文件不存在 ".concat(str));
        }
        if (file.isDirectory()) {
            return kc9.INSTANCE.s("源文件不存在是一个目录 ".concat(str));
        }
        if (!file.canRead()) {
            return kc9.INSTANCE.a("源文件没有读权限 ".concat(str));
        }
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            return kc9.INSTANCE.m("目标文件路径的上层目录不存在 ".concat(str2));
        }
        if (!file2.exists()) {
            File parentFile2 = file2.getParentFile();
            if (parentFile2 == null || !parentFile2.canWrite()) {
                return kc9.INSTANCE.c("指定目标文件路径没有写权限 ".concat(str2));
            }
        } else if (!file2.canWrite()) {
            return kc9.INSTANCE.c("指定目标文件路径没有写权限 ".concat(str2));
        }
        if (file.length() > 52428800) {
            return kc9.INSTANCE.o("单个文件超限");
        }
        FileOutputStream fileOutputStream = null;
        Long valueOf = str3 != null ? Long.valueOf(oc9.f(new File(str3))) : null;
        if (valueOf != null && valueOf.longValue() + file.length() > 104857600) {
            return kc9.INSTANCE.o("文件夹超限");
        }
        try {
            b2 = lqx.Companion.b(file.getPath());
            ckf.f(b2, "(ZipFileInfo.Companion).parse(srcFile.path)");
        } catch (Throwable th3) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th3));
        }
        if (!b2.d()) {
            return ErrorResult.a.Companion.g("源文件不是zip类型");
        }
        if (b2.b()) {
            return ErrorResult.a.Companion.g("file path contains relative parent path");
        }
        if (b2.a() <= 52428800 && b2.c() <= 52428800) {
            if (valueOf == null) {
                xhvVar = null;
            } else if (valueOf.longValue() + b2.c() > 104857600) {
                return kc9.INSTANCE.o("文件夹超限");
            } else {
                xhvVar = xhv.INSTANCE;
            }
            obj = Result.m1108constructorimpl(xhvVar);
            if (Result.m1111exceptionOrNullimpl(obj) != null) {
                return new ErrorResult(String.valueOf(499), "未知错误: " + th.getMessage(), (Map) null, 4, (a07) null);
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = null;
            byte[] b3 = k2d.INSTANCE.b(2048);
            ckf.f(b3, "IOUtils.INSTANCE.getBuf(2048)");
            String concat = !tsq.w(str2, "/", false, 2, null) ? str2.concat("/") : str2;
            try {
                ref$ObjectRef.element = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
                for (ZipEntry zipEntry : acp.g(new FileAbility$unzip$4(ref$ObjectRef))) {
                    String name = zipEntry.getName();
                    ckf.f(name, "zipEntry.name");
                    if (!TextUtils.isEmpty(name) && !tsq.I(name, "../", false, 2, null) && !tsq.w(name, "/..", false, 2, null) && !wsq.O(name, "/../", false, 2, null)) {
                        File file3 = new File(concat + name);
                        if (zipEntry.isDirectory()) {
                            file3.mkdirs();
                        } else {
                            File parentFile3 = file3.getParentFile();
                            if (parentFile3 != null) {
                                if (!parentFile3.exists()) {
                                    parentFile3.mkdirs();
                                }
                                try {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                    while (true) {
                                        try {
                                            int read = ((ZipInputStream) ref$ObjectRef.element).read(b3);
                                            if (read <= 0) {
                                                break;
                                            }
                                            fileOutputStream2.write(b3, 0, read);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            fileOutputStream = fileOutputStream2;
                                            k2d.INSTANCE.a(fileOutputStream);
                                            throw th2;
                                        }
                                    }
                                    k2d.INSTANCE.a(fileOutputStream2);
                                } catch (Throwable th5) {
                                    th2 = th5;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                            }
                        }
                    }
                }
                return new FinishResult(null, "success", 1, null);
            } catch (Throwable th6) {
                try {
                    th6.printStackTrace();
                    return new ErrorResult(String.valueOf(499), "未知错误: " + th6.getMessage(), (Map) null, 4, (a07) null);
                } finally {
                    k2d k2dVar = k2d.INSTANCE;
                    k2dVar.e(b3);
                    k2dVar.a((ZipInputStream) ref$ObjectRef.element);
                }
            }
        }
        return kc9.INSTANCE.o("单个文件超限");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
        if (r22.equals("DirectArrayBuffer") != false) goto L_0x00f2;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f A[Catch: Exception -> 0x00e7, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e7, blocks: (B:49:0x00ce, B:52:0x00d8, B:55:0x00e2, B:58:0x00ea, B:61:0x00f4, B:63:0x00fd, B:64:0x0104, B:67:0x010e, B:68:0x0118, B:70:0x0120, B:71:0x0125, B:73:0x012f), top: B:119:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.ExecuteResult p(java.lang.String r19, java.lang.String r20, java.nio.ByteBuffer r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.alibity.container.file.FileAbility.p(java.lang.String, java.lang.String, java.nio.ByteBuffer, java.lang.String, boolean):com.alibaba.ability.result.ExecuteResult");
    }
}
