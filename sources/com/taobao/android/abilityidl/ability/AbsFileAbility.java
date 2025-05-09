package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.bc9;
import tb.bf9;
import tb.dc9;
import tb.gd9;
import tb.ih9;
import tb.jd9;
import tb.kdb;
import tb.ld9;
import tb.p6c;
import tb.q6c;
import tb.qc9;
import tb.s6c;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.u6c;
import tb.uc9;
import tb.v6c;
import tb.w6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsFileAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336615);
    }

    public static /* synthetic */ Object ipc$super(AbsFileAbility absFileAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsFileAbility");
    }

    public abstract void appendFile(kdb kdbVar, ih9 ih9Var, p6c p6cVar);

    public abstract tao<Boolean, ErrorResult> appendFileSync(kdb kdbVar, ih9 ih9Var);

    public abstract void copyFile(kdb kdbVar, dc9 dc9Var, p6c p6cVar);

    public abstract tao<Boolean, ErrorResult> copyFileSync(kdb kdbVar, dc9 dc9Var);

    public abstract void exists(kdb kdbVar, bc9 bc9Var, p6c p6cVar);

    public abstract tao<Boolean, ErrorResult> existsSync(kdb kdbVar, bc9 bc9Var);

    public abstract void getDirInfo(kdb kdbVar, bc9 bc9Var, q6c q6cVar);

    public abstract tao<List<FileItem>, ErrorResult> getDirInfoSync(kdb kdbVar, bc9 bc9Var);

    public abstract void getFileInfo(kdb kdbVar, qc9 qc9Var, s6c s6cVar);

    public abstract tao<FileInfoResult, ErrorResult> getFileInfoSync(kdb kdbVar, qc9 qc9Var);

    public abstract void makeDir(kdb kdbVar, uc9 uc9Var, p6c p6cVar);

    public abstract tao<Boolean, ErrorResult> makeDirSync(kdb kdbVar, uc9 uc9Var);

    public abstract void readAsString(kdb kdbVar, gd9 gd9Var, u6c u6cVar);

    public abstract tao<String, ErrorResult> readAsStringSync(kdb kdbVar, gd9 gd9Var);

    public abstract void removeDir(kdb kdbVar, jd9 jd9Var, p6c p6cVar);

    public abstract tao<Boolean, ErrorResult> removeDirSync(kdb kdbVar, jd9 jd9Var);

    public abstract void removeFile(kdb kdbVar, bc9 bc9Var, p6c p6cVar);

    public abstract tao<Boolean, ErrorResult> removeFileSync(kdb kdbVar, bc9 bc9Var);

    public abstract void rename(kdb kdbVar, ld9 ld9Var, v6c v6cVar);

    public abstract tao<String, ErrorResult> renameSync(kdb kdbVar, ld9 ld9Var);

    public abstract void unzip(kdb kdbVar, bf9 bf9Var, w6c w6cVar);

    public abstract tao<String, ErrorResult> unzipSync(kdb kdbVar, bf9 bf9Var);

    public abstract void writeFile(kdb kdbVar, ih9 ih9Var, p6c p6cVar);

    public abstract tao<Boolean, ErrorResult> writeFileSync(kdb kdbVar, ih9 ih9Var);
}
