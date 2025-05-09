package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class DocumentFile {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DocumentFile";
    private final DocumentFile mParent;

    public DocumentFile(DocumentFile documentFile) {
        this.mParent = documentFile;
    }

    public static DocumentFile fromFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("e3959872", new Object[]{file});
        }
        return new RawDocumentFile(null, file);
    }

    public static DocumentFile fromSingleUri(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("ca84062e", new Object[]{context, uri});
        }
        return new SingleDocumentFile(null, context, uri);
    }

    public static DocumentFile fromTreeUri(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("5b495418", new Object[]{context, uri});
        }
        return new TreeDocumentFile(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean isDocumentUri(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5267f8d1", new Object[]{context, uri})).booleanValue();
        }
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    public abstract DocumentFile createDirectory(String str);

    public abstract DocumentFile createFile(String str, String str2);

    public abstract boolean delete();

    public abstract boolean exists();

    public abstract String getName();

    public DocumentFile getParentFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("37365531", new Object[]{this});
        }
        return this.mParent;
    }

    public abstract String getType();

    public abstract Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    public abstract DocumentFile[] listFiles();

    public abstract boolean renameTo(String str);

    public DocumentFile findFile(String str) {
        DocumentFile[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("df3f1894", new Object[]{this, str});
        }
        for (DocumentFile documentFile : listFiles()) {
            if (str.equals(documentFile.getName())) {
                return documentFile;
            }
        }
        return null;
    }
}
