package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class SQLTrace implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String dbName;

    public SQLTrace(String str) {
        this.dbName = str;
    }

    public abstract void onDBError(String str, int i, String str2);

    public abstract void onSQLFail(String str, int i, String str2, int i2);

    public abstract void onSQLSuccess(String str, int i);
}
