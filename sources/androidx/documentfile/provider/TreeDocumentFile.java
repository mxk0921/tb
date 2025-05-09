package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TreeDocumentFile extends DocumentFile {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private Uri mUri;

    public TreeDocumentFile(DocumentFile documentFile, Context context, Uri uri) {
        super(documentFile);
        this.mContext = context;
        this.mUri = uri;
    }

    private static void closeQuietly(AutoCloseable autoCloseable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8532ddc2", new Object[]{autoCloseable});
        } else if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TreeDocumentFile treeDocumentFile, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/documentfile/provider/TreeDocumentFile");
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bf3711", new Object[]{this})).booleanValue();
        }
        return DocumentsContractApi19.canRead(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f763efa", new Object[]{this})).booleanValue();
        }
        return DocumentsContractApi19.canWrite(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createDirectory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("8907c790", new Object[]{this, str});
        }
        Uri createFile = createFile(this.mContext, this.mUri, "vnd.android.document/directory", str);
        if (createFile != null) {
            return new TreeDocumentFile(this, this.mContext, createFile);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createFile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile) ipChange.ipc$dispatch("39135821", new Object[]{this, str, str2});
        }
        Uri createFile = createFile(this.mContext, this.mUri, str, str2);
        if (createFile != null) {
            return new TreeDocumentFile(this, this.mContext, createFile);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691b3cb6", new Object[]{this})).booleanValue();
        }
        try {
            return DocumentsContract.deleteDocument(this.mContext.getContentResolver(), this.mUri);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c31eae7", new Object[]{this})).booleanValue();
        }
        return DocumentsContractApi19.exists(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return DocumentsContractApi19.getName(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return DocumentsContractApi19.getType(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public Uri getUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this});
        }
        return this.mUri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b5fb6e", new Object[]{this})).booleanValue();
        }
        return DocumentsContractApi19.isDirectory(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4ce0351", new Object[]{this})).booleanValue();
        }
        return DocumentsContractApi19.isFile(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6c28c", new Object[]{this})).booleanValue();
        }
        return DocumentsContractApi19.isVirtual(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a41db07a", new Object[]{this})).longValue();
        }
        return DocumentsContractApi19.lastModified(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc61", new Object[]{this})).longValue();
        }
        return DocumentsContractApi19.length(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e686c2e", new Object[]{this, str})).booleanValue();
        }
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.mContext.getContentResolver(), this.mUri, str);
            if (renameDocument != null) {
                this.mUri = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static Uri createFile(Context context, Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("256f2429", new Object[]{context, uri, str, str2});
        }
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] listFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocumentFile[]) ipChange.ipc$dispatch("e70960df", new Object[]{this});
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = this.mUri;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.mUri, cursor.getString(0)));
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed query: ");
                sb.append(e);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            DocumentFile[] documentFileArr = new DocumentFile[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                documentFileArr[i] = new TreeDocumentFile(this, this.mContext, uriArr[i]);
            }
            return documentFileArr;
        } finally {
            closeQuietly(cursor);
        }
    }
}
