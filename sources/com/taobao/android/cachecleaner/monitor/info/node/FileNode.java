package com.taobao.android.cachecleaner.monitor.info.node;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tb.t2o;
import tb.yr2;
import tb.yve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FileNode implements yve, Serializable, Comparable<FileNode> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTORY_TYPE = 0;
    private static final String FIELD_SEPARATOR = "_&&_";
    public static final int FILE_TYPE = 1;
    private static final String TAG = "FileNode";
    public static final int UNKNOWN_TYPE = 2;
    private final List<yve> mChildren;
    private final boolean mIsDir;
    private final long mLastModifiedTime;
    private final String mName;
    private final yve mParent;
    private long mSize;
    private final int mType;

    static {
        t2o.a(737149059);
        t2o.a(737149061);
    }

    public FileNode(yve yveVar, File file) {
        this(yveVar, (String) null, file);
    }

    private static int hash(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f836026f", new Object[]{objArr})).intValue();
        }
        return hashCode(objArr);
    }

    private static int safeParseInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf01e97c", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            TLog.loge(yr2.MODULE, TAG, "safeParseInt: parse int with exception " + e);
            return i;
        }
    }

    private static long safeParseLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("920e4145", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            TLog.loge(yr2.MODULE, TAG, "safeParseLong: parse int with exception " + e);
            return j;
        }
    }

    @Override // tb.yve
    public void addChild(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf9ae38", new Object[]{this, yveVar});
        } else {
            this.mChildren.add(yveVar);
        }
    }

    @Override // tb.yve
    public List<yve> children() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("740eda81", new Object[]{this});
        }
        return this.mChildren;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileNode fileNode = (FileNode) obj;
        if (this.mIsDir == fileNode.mIsDir && this.mSize == fileNode.mSize && this.mLastModifiedTime == fileNode.mLastModifiedTime && TextUtils.equals(this.mName, fileNode.mName)) {
            return true;
        }
        return false;
    }

    public long getModifiedTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adb79e27", new Object[]{this})).longValue();
        }
        return this.mLastModifiedTime;
    }

    @Override // tb.yve
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    @Override // tb.yve
    public long getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
        }
        return this.mSize;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.mName, Boolean.valueOf(this.mIsDir), Long.valueOf(this.mSize), Long.valueOf(this.mLastModifiedTime));
    }

    @Override // tb.yve
    public boolean isDirectory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b5fb6e", new Object[]{this})).booleanValue();
        }
        return this.mIsDir;
    }

    @Override // tb.yve
    public yve parent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yve) ipChange.ipc$dispatch("cf8ec47b", new Object[]{this});
        }
        return this.mParent;
    }

    @Override // tb.yve
    public String path() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dd143f4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mName);
        for (yve yveVar = this.mParent; yveVar != null; yveVar = yveVar.parent()) {
            sb.insert(0, yveVar.getName() + File.separator);
        }
        return sb.toString();
    }

    @Override // tb.yve
    public void setSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687ad7a", new Object[]{this, new Long(j)});
        } else {
            this.mSize = j;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{" + this.mName + FIELD_SEPARATOR + this.mType + FIELD_SEPARATOR + this.mSize + FIELD_SEPARATOR + this.mLastModifiedTime + "}";
    }

    @Override // tb.yve
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public FileNode(String str, File file) {
        this((yve) null, str, file);
    }

    private static int hashCode(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a54f8c2", new Object[]{objArr})).intValue();
        }
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            i = (i * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i;
    }

    public int compareTo(FileNode fileNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd036ae2", new Object[]{this, fileNode})).intValue();
        }
        long j = this.mSize;
        long j2 = fileNode.mSize;
        if (j > j2) {
            return 1;
        }
        return j == j2 ? 0 : -1;
    }

    public FileNode(yve yveVar, String str, File file) {
        String str2;
        this.mChildren = new ArrayList();
        this.mParent = yveVar;
        int i = 0;
        if (file == null) {
            this.mName = null;
            this.mType = 2;
            this.mIsDir = false;
            this.mLastModifiedTime = -1L;
            return;
        }
        if (str == null) {
            str2 = file.getName();
        } else {
            str2 = str + File.separator + file.getName();
        }
        this.mName = str2;
        boolean isDirectory = file.isDirectory();
        this.mIsDir = isDirectory;
        this.mType = !file.isDirectory() ? file.isFile() ? 1 : 2 : i;
        this.mLastModifiedTime = file.lastModified();
        if (!isDirectory) {
            this.mSize = file.length();
        } else {
            this.mSize = 0L;
        }
    }

    public FileNode(yve yveVar, String str) {
        this(yveVar, (String) null, str);
    }

    public FileNode(String str, String str2) {
        this((yve) null, str, str2);
    }

    public FileNode(yve yveVar, String str, String str2) {
        String str3;
        this.mChildren = new ArrayList();
        this.mParent = yveVar;
        boolean z = false;
        if (TextUtils.isEmpty(str2) || str2.length() < 2) {
            TLog.logd(yr2.MODULE, TAG, "FileNode: serialStr is wrong, input string is " + str2);
            this.mName = null;
            this.mType = 2;
            this.mIsDir = false;
            this.mLastModifiedTime = -1L;
            return;
        }
        String[] split = str2.substring(1, str2.length() - 1).split(FIELD_SEPARATOR);
        if (split.length != 4) {
            TLog.logd(yr2.MODULE, TAG, "FileNode: serial string parse error, input string is ".concat(str2));
            this.mName = null;
            this.mType = 2;
            this.mIsDir = false;
            this.mLastModifiedTime = -1L;
            return;
        }
        if (str == null) {
            str3 = split[0];
        } else {
            str3 = str + File.separator + split[0];
        }
        this.mName = str3;
        int safeParseInt = safeParseInt(split[1], 2);
        this.mType = safeParseInt;
        this.mIsDir = safeParseInt == 0 ? true : z;
        this.mSize = safeParseLong(split[2], -1L);
        this.mLastModifiedTime = safeParseLong(split[3], -1L);
    }
}
