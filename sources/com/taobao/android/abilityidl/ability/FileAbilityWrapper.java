package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.alibity.container.file.FileAbility;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bc9;
import tb.bf9;
import tb.ckf;
import tb.dc9;
import tb.gd9;
import tb.ih9;
import tb.jd9;
import tb.kdb;
import tb.ld9;
import tb.oiy;
import tb.piy;
import tb.qc9;
import tb.qiy;
import tb.siy;
import tb.t2o;
import tb.tiy;
import tb.uc9;
import tb.uiy;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class FileAbilityWrapper extends AbsAbilityWrapper<AbsFileAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336916);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAbilityWrapper(AbsFileAbility absFileAbility) {
        super(absFileAbility);
        ckf.g(absFileAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(FileAbilityWrapper fileAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FileAbilityWrapper");
    }

    @Override // com.alibaba.ability.AbsAbilityWrapper, tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        switch (str.hashCode()) {
            case -2139808842:
                if (!str.equals(FileAbility.API_APPEND_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().appendFile(kdbVar, new ih9(map), new oiy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1767682860:
                if (!str.equals("readAsStringSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().readAsStringSync(kdbVar, new gd9(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1588426075:
                if (!str.equals(FileAbility.API_GET_DIR_INFO)) {
                    return null;
                }
                try {
                    getAbilityImpl().getDirInfo(kdbVar, new bc9(map), new piy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -1429485660:
                if (!str.equals("removeDirSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().removeDirSync(kdbVar, new jd9(map)).e();
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case -1406748165:
                if (!str.equals(FileAbility.API_WRITE_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().writeFile(kdbVar, new ih9(map), new oiy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case -1335382278:
                if (!str.equals("makeDirSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().makeDirSync(kdbVar, new uc9(map)).e();
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case -1289358244:
                if (!str.equals(FileAbility.API_EXISTS)) {
                    return null;
                }
                try {
                    getAbilityImpl().exists(kdbVar, new bc9(map), new oiy(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case -1251412231:
                if (!str.equals("renameSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().renameSync(kdbVar, new ld9(map)).e();
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            case -996417679:
                if (!str.equals("appendFileSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().appendFileSync(kdbVar, new ih9(map)).e();
                } catch (Throwable th9) {
                    return ErrorResult.a.Companion.g(th9.getMessage());
                }
            case -934594754:
                if (!str.equals(FileAbility.API_RENAME)) {
                    return null;
                }
                try {
                    getAbilityImpl().rename(kdbVar, new ld9(map), new tiy(vqVar));
                    return null;
                } catch (Throwable th10) {
                    return ErrorResult.a.Companion.g(th10.getMessage());
                }
            case -506374511:
                if (!str.equals(FileAbility.API_COPY_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().copyFile(kdbVar, new dc9(map), new oiy(vqVar));
                    return null;
                } catch (Throwable th11) {
                    return ErrorResult.a.Companion.g(th11.getMessage());
                }
            case 111449576:
                if (!str.equals(FileAbility.API_UNZIP)) {
                    return null;
                }
                try {
                    getAbilityImpl().unzip(kdbVar, new bf9(map), new uiy(vqVar));
                    return null;
                } catch (Throwable th12) {
                    return ErrorResult.a.Companion.g(th12.getMessage());
                }
            case 205780247:
                if (!str.equals("existsSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().existsSync(kdbVar, new bc9(map)).e();
                } catch (Throwable th13) {
                    return ErrorResult.a.Companion.g(th13.getMessage());
                }
            case 536386683:
                if (!str.equals("getFileInfoSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFileInfoSync(kdbVar, new qc9(map)).e();
                } catch (Throwable th14) {
                    return ErrorResult.a.Companion.g(th14.getMessage());
                }
            case 832575423:
                if (!str.equals(FileAbility.API_MAKE_DIR)) {
                    return null;
                }
                try {
                    getAbilityImpl().makeDir(kdbVar, new uc9(map), new oiy(vqVar));
                    return null;
                } catch (Throwable th15) {
                    return ErrorResult.a.Companion.g(th15.getMessage());
                }
            case 1098154016:
                if (!str.equals(FileAbility.API_REMOVE_FILE)) {
                    return null;
                }
                try {
                    getAbilityImpl().removeFile(kdbVar, new bc9(map), new oiy(vqVar));
                    return null;
                } catch (Throwable th16) {
                    return ErrorResult.a.Companion.g(th16.getMessage());
                }
            case 1245331168:
                if (!str.equals("getDirInfoSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getDirInfoSync(kdbVar, new bc9(map)).e();
                } catch (Throwable th17) {
                    return ErrorResult.a.Companion.g(th17.getMessage());
                }
            case 1282348393:
                if (!str.equals(FileAbility.API_REMOVE_DIR)) {
                    return null;
                }
                try {
                    getAbilityImpl().removeDir(kdbVar, new jd9(map), new oiy(vqVar));
                    return null;
                } catch (Throwable th18) {
                    return ErrorResult.a.Companion.g(th18.getMessage());
                }
            case 1342041536:
                if (!str.equals(FileAbility.API_GET_FILE_INFO)) {
                    return null;
                }
                try {
                    getAbilityImpl().getFileInfo(kdbVar, new qc9(map), new qiy(vqVar));
                    return null;
                } catch (Throwable th19) {
                    return ErrorResult.a.Companion.g(th19.getMessage());
                }
            case 1430188195:
                if (!str.equals("unzipSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().unzipSync(kdbVar, new bf9(map)).e();
                } catch (Throwable th20) {
                    return ErrorResult.a.Companion.g(th20.getMessage());
                }
            case 1431909580:
                if (!str.equals("copyFileSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().copyFileSync(kdbVar, new dc9(map)).e();
                } catch (Throwable th21) {
                    return ErrorResult.a.Companion.g(th21.getMessage());
                }
            case 1572385433:
                if (!str.equals(FileAbility.API_READ_AS_STRING)) {
                    return null;
                }
                try {
                    getAbilityImpl().readAsString(kdbVar, new gd9(map), new siy(vqVar));
                    return null;
                } catch (Throwable th22) {
                    return ErrorResult.a.Companion.g(th22.getMessage());
                }
            case 1713034038:
                if (!str.equals("writeFileSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().writeFileSync(kdbVar, new ih9(map)).e();
                } catch (Throwable th23) {
                    return ErrorResult.a.Companion.g(th23.getMessage());
                }
            case 1964965595:
                if (!str.equals("removeFileSync")) {
                    return null;
                }
                try {
                    return getAbilityImpl().removeFileSync(kdbVar, new bc9(map)).e();
                } catch (Throwable th24) {
                    return ErrorResult.a.Companion.g(th24.getMessage());
                }
            default:
                return null;
        }
    }
}
