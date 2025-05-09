package com.taobao.analysis.v3;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.rz8;
import tb.zxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StageList extends CopyOnWriteArrayList<rz8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(StageList stageList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/v3/StageList");
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<rz8> it = iterator();
            while (it.hasNext()) {
                rz8 next = it.next();
                if (next.b > 0) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(next.name());
                    sb.append("=");
                    sb.append(next.b);
                    sb.append(":");
                    sb.append(next.c);
                    sb.append(":");
                    if (!TextUtils.isEmpty(next.e)) {
                        str = zxv.c(next.e);
                    } else {
                        str = "";
                    }
                    sb.append(str);
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
