package androidx.core.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AtomicFile {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "AtomicFile";
    private final File mBaseName;
    private final File mLegacyBackupName;
    private final File mNewName;

    public AtomicFile(File file) {
        this.mBaseName = file;
        this.mNewName = new File(file.getPath() + ".new");
        this.mLegacyBackupName = new File(file.getPath() + ".bak");
    }

    private static void rename(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dc79f3", new Object[]{file, file2});
            return;
        }
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(LOG_TAG, "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e(LOG_TAG, "Failed to rename " + file + " to " + file2);
        }
    }

    private static boolean sync(FileOutputStream fileOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8b7e7c", new Object[]{fileOutputStream})).booleanValue();
        }
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        this.mBaseName.delete();
        this.mNewName.delete();
        this.mLegacyBackupName.delete();
    }

    public void failWrite(FileOutputStream fileOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbd98be", new Object[]{this, fileOutputStream});
        } else if (fileOutputStream != null) {
            if (!sync(fileOutputStream)) {
                Log.e(LOG_TAG, "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e(LOG_TAG, "Failed to close file output stream", e);
            }
            if (!this.mNewName.delete()) {
                Log.e(LOG_TAG, "Failed to delete new file " + this.mNewName);
            }
        }
    }

    public void finishWrite(FileOutputStream fileOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9048729", new Object[]{this, fileOutputStream});
        } else if (fileOutputStream != null) {
            if (!sync(fileOutputStream)) {
                Log.e(LOG_TAG, "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e(LOG_TAG, "Failed to close file output stream", e);
            }
            rename(this.mNewName, this.mBaseName);
        }
    }

    public File getBaseFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("396248e3", new Object[]{this});
        }
        return this.mBaseName;
    }

    public FileInputStream openRead() throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileInputStream) ipChange.ipc$dispatch("88668026", new Object[]{this});
        }
        if (this.mLegacyBackupName.exists()) {
            rename(this.mLegacyBackupName, this.mBaseName);
        }
        if (this.mNewName.exists() && this.mBaseName.exists() && !this.mNewName.delete()) {
            Log.e(LOG_TAG, "Failed to delete outdated new file " + this.mNewName);
        }
        return new FileInputStream(this.mBaseName);
    }

    public byte[] readFully() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("46abdde2", new Object[]{this});
        }
        FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i = 0;
            while (true) {
                int read = openRead.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = openRead.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    public FileOutputStream startWrite() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileOutputStream) ipChange.ipc$dispatch("36ee7808", new Object[]{this});
        }
        if (this.mLegacyBackupName.exists()) {
            rename(this.mLegacyBackupName, this.mBaseName);
        }
        try {
            return new FileOutputStream(this.mNewName);
        } catch (FileNotFoundException unused) {
            if (this.mNewName.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.mNewName);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.mNewName, e);
                }
            } else {
                throw new IOException("Failed to create directory for " + this.mNewName);
            }
        }
    }
}
