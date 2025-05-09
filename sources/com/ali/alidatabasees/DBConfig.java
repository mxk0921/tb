package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import tb.d55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DBConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String dbName;
    private d55 dbOpenCallback;
    private String journalMode;
    private String key;
    private int maxConnectionsCount;
    private String path;
    private SQLTrace sqlTrace;
    private int userVersion;

    public DBConfig(String str) {
        this.path = str;
        String[] split = str.split(File.pathSeparator);
        if (split.length > 0) {
            this.dbName = split[split.length - 1];
        } else {
            this.dbName = "";
        }
    }

    public String getDbName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3ea793a", new Object[]{this});
        }
        return this.dbName;
    }

    public d55 getDbOpenCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d55) ipChange.ipc$dispatch("ea11d107", new Object[]{this});
        }
        return this.dbOpenCallback;
    }

    public String getJournalMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6db79135", new Object[]{this});
        }
        return this.journalMode;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }

    public int getMaxConnectionsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3444f82", new Object[]{this})).intValue();
        }
        return this.maxConnectionsCount;
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.path;
    }

    public SQLTrace getSqlTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLTrace) ipChange.ipc$dispatch("1f73cc93", new Object[]{this});
        }
        return this.sqlTrace;
    }

    public int getUserVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f824651", new Object[]{this})).intValue();
        }
        return this.userVersion;
    }

    public void onDatabaseOpenedCallback(long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95220455", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        d55 d55Var = this.dbOpenCallback;
        if (d55Var != null) {
            d55Var.a(new DBConnection(j), i, i2);
        }
    }

    public void setDbOpenCallback(d55 d55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec8151", new Object[]{this, d55Var});
        } else {
            this.dbOpenCallback = d55Var;
        }
    }

    public void setJournalMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f1c449", new Object[]{this, str});
        } else {
            this.journalMode = str;
        }
    }

    public void setKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
        } else {
            this.key = str;
        }
    }

    public void setMaxConnectionsCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2512de60", new Object[]{this, new Integer(i)});
        } else {
            this.maxConnectionsCount = i;
        }
    }

    public void setProperty(Property property, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b621edbb", new Object[]{this, property, str});
        } else if (property == Property.Key) {
            this.key = str;
        } else if (property == Property.UserVersion) {
            this.userVersion = Integer.valueOf(str).intValue();
        } else if (property == Property.JournalMode) {
            this.journalMode = str;
        }
    }

    public void setSqlTrace(SQLTrace sQLTrace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e351f1", new Object[]{this, sQLTrace});
        } else {
            this.sqlTrace = sQLTrace;
        }
    }

    public void setUserVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c38d71", new Object[]{this, new Integer(i)});
        } else {
            this.userVersion = i;
        }
    }

    public DBConfig(String str, String str2) {
        this.path = str;
        this.dbName = str2;
    }
}
