package com.taobao.android.cachecleaner.monitor.info.node;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import tb.t2o;
import tb.wul;
import tb.yve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FileNodeNew implements yve, Serializable, Comparable<FileNodeNew> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTORY_TYPE = 0;
    private static final String FIELD_SEPARATOR = "_&&_";
    public static final int FILE_TYPE = 1;
    private static final String TAG = "FileNodeNew";
    public static final int UNKNOWN_TYPE = 2;
    private boolean mIsDir;
    private long mLastModifiedTime;
    private String mName;
    private Path mRealPath;
    private long mSize;
    private int mType;

    static {
        t2o.a(737149060);
        t2o.a(737149061);
    }

    public FileNodeNew(Path path, BasicFileAttributes basicFileAttributes, long j) {
        Path fileName;
        String path2;
        boolean isDirectory;
        boolean isDirectory2;
        FileTime lastModifiedTime;
        long millis;
        long size;
        boolean isRegularFile;
        if (Build.VERSION.SDK_INT >= 26) {
            this.mRealPath = path;
            fileName = path.getFileName();
            path2 = fileName.toString();
            this.mName = path2;
            int i = 2;
            if (basicFileAttributes != null) {
                isDirectory = basicFileAttributes.isDirectory();
                this.mIsDir = isDirectory;
                isDirectory2 = basicFileAttributes.isDirectory();
                if (isDirectory2) {
                    i = 0;
                } else {
                    isRegularFile = basicFileAttributes.isRegularFile();
                    if (isRegularFile) {
                        i = 1;
                    }
                }
                this.mType = i;
                lastModifiedTime = basicFileAttributes.lastModifiedTime();
                millis = lastModifiedTime.toMillis();
                this.mLastModifiedTime = millis;
                if (!this.mIsDir) {
                    size = basicFileAttributes.size();
                    this.mSize = size;
                    return;
                }
                this.mSize = j;
                return;
            }
            this.mIsDir = false;
            this.mType = 2;
            this.mLastModifiedTime = -1L;
            this.mSize = 0L;
        }
    }

    private static int hash(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f836026f", new Object[]{objArr})).intValue();
        }
        return hashCode(objArr);
    }

    @Override // tb.yve
    public void addChild(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf9ae38", new Object[]{this, yveVar});
        }
    }

    @Override // tb.yve
    public List<yve> children() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("740eda81", new Object[]{this});
        }
        return Collections.emptyList();
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
        FileNodeNew fileNodeNew = (FileNodeNew) obj;
        if (this.mIsDir == fileNodeNew.mIsDir && this.mSize == fileNodeNew.mSize && this.mLastModifiedTime == fileNodeNew.mLastModifiedTime && TextUtils.equals(this.mName, fileNodeNew.mName)) {
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
        return null;
    }

    public String parentPath() {
        Path g;
        Path parent;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e66ce6a", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 26 || (g = wul.a().g(this.mRealPath)) == null) {
            return "";
        }
        parent = g.getParent();
        path = parent.toString();
        return path;
    }

    @Override // tb.yve
    public String path() {
        Path g;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dd143f4", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 26 || (g = wul.a().g(this.mRealPath)) == null) {
            return "";
        }
        path = g.toString();
        return path;
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

    public int compareTo(FileNodeNew fileNodeNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b48273b4", new Object[]{this, fileNodeNew})).intValue();
        }
        long j = this.mSize;
        long j2 = fileNodeNew.mSize;
        if (j > j2) {
            return 1;
        }
        return j == j2 ? 0 : -1;
    }
}
