package androidx.documentfile.provider;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RawDocumentFile extends DocumentFile {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private File mFile;

    public RawDocumentFile(DocumentFile documentFile, File file) {
        super(documentFile);
        this.mFile = file;
    }

    private static String getTypeForName(String str) {
        String mimeTypeFromExtension;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73a448b", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase())) == null) {
            return UploadConstants.FILE_CONTENT_TYPE;
        }
        return mimeTypeFromExtension;
    }

    public static /* synthetic */ Object ipc$super(RawDocumentFile rawDocumentFile, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/documentfile/provider/RawDocumentFile");
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bf3711", new Object[]{this})).booleanValue();
        }
        return this.mFile.canRead();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f763efa", new Object[]{this})).booleanValue();
        }
        return this.mFile.canWrite();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createDirectory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("8907c790", new Object[]{this, str});
        }
        File file = new File(this.mFile, str);
        if (file.isDirectory() || file.mkdir()) {
            return new RawDocumentFile(this, file);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createFile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("39135821", new Object[]{this, str, str2});
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.mFile, str2);
        try {
            file.createNewFile();
            return new RawDocumentFile(this, file);
        } catch (IOException e) {
            new StringBuilder("Failed to createFile: ").append(e);
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691b3cb6", new Object[]{this})).booleanValue();
        }
        deleteContents(this.mFile);
        return this.mFile.delete();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c31eae7", new Object[]{this})).booleanValue();
        }
        return this.mFile.exists();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mFile.getName();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        if (this.mFile.isDirectory()) {
            return null;
        }
        return getTypeForName(this.mFile.getName());
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public Uri getUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this});
        }
        return Uri.fromFile(this.mFile);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b5fb6e", new Object[]{this})).booleanValue();
        }
        return this.mFile.isDirectory();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4ce0351", new Object[]{this})).booleanValue();
        }
        return this.mFile.isFile();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6c28c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a41db07a", new Object[]{this})).longValue();
        }
        return this.mFile.lastModified();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc61", new Object[]{this})).longValue();
        }
        return this.mFile.length();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e686c2e", new Object[]{this, str})).booleanValue();
        }
        File file = new File(this.mFile.getParentFile(), str);
        if (!this.mFile.renameTo(file)) {
            return false;
        }
        this.mFile = file;
        return true;
    }

    private static boolean deleteContents(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea1b3067", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                z &= deleteContents(file2);
            }
            if (!file2.delete()) {
                new StringBuilder("Failed to delete ").append(file2);
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] listFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile[]) ipChange.ipc$dispatch("e70960df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.mFile.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new RawDocumentFile(this, file));
            }
        }
        return (DocumentFile[]) arrayList.toArray(new DocumentFile[arrayList.size()]);
    }
}
