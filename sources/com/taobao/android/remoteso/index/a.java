package com.taobao.android.remoteso.index;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import tb.bg4;
import tb.cgd;
import tb.fte;
import tb.kd1;
import tb.rbn;
import tb.trq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d45e72b", new Object[]{soFileInfo});
        } else if (trq.c(soFileInfo.getMd5())) {
            throw RSoException.error(2003, soFileInfo.toString());
        } else if (trq.c(soFileInfo.getUri())) {
            throw RSoException.error(2004, soFileInfo.toString());
        }
    }

    public static <T> List<T> c(Application application, cgd cgdVar, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1444ee94", new Object[]{application, cgdVar, str, cls});
        }
        try {
            List<T> parseArray = JSON.parseArray(bg4.b(cgdVar, str), cls);
            if (parseArray != null) {
                return parseArray;
            }
            byte[] b = kd1.b(application, str);
            if (b != null) {
                List<T> parseArray2 = JSON.parseArray(new String(b), cls);
                if (parseArray2 != null) {
                    return parseArray2;
                }
                throw new IllegalStateException("parse data got null, key = " + str + ", clz = " + cls);
            }
            throw new IllegalStateException("bytes from assets/ got null, key = " + str + ", clz = " + cls);
        } catch (Throwable th) {
            rbn.g("index -> key = " + str + ", clz = " + cls, th);
            return null;
        }
    }

    public static <T> T b(Application application, cgd cgdVar, String str, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d6036001", new Object[]{application, cgdVar, str, cls});
        }
        T t2 = (T) bg4.a(cgdVar, str, cls);
        if (t2 != null) {
            RSoLog.d("index -> readData from config");
            return t2;
        } else if (!cgdVar.a("key_codegen_index_enabled", true) || (t = (T) fte.a(str, cls)) == null) {
            try {
                byte[] b = kd1.b(application, str);
                if (b != null) {
                    T t3 = (T) JSON.parseObject(b, cls, new Feature[0]);
                    if (t3 != null) {
                        RSoLog.d("index -> readData from assets");
                        return t3;
                    }
                    throw new IllegalStateException("parse data got null, key = " + str + ", clz = " + cls);
                }
                throw new IllegalStateException("bytes from assets/ got null, key = " + str + ", clz = " + cls);
            } catch (Throwable th) {
                rbn.g("index -> key = " + str + ", clz = " + cls, th);
                return null;
            }
        } else {
            RSoLog.d("index -> readData from IndexBuilderOpt");
            return t;
        }
    }
}
