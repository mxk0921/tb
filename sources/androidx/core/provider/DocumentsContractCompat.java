package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileNotFoundException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DocumentsContractCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PATH_TREE = "tree";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;

        private DocumentCompat() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DocumentsContractApi21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private DocumentsContractApi21Impl() {
        }

        public static Uri buildChildDocumentsUri(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("3b40c954", new Object[]{str, str2});
            }
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        public static Uri buildChildDocumentsUriUsingTree(Uri uri, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("34d3841", new Object[]{uri, str});
            }
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        public static Uri buildDocumentUriUsingTree(Uri uri, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("f08bc142", new Object[]{uri, str});
            }
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        public static Uri buildTreeDocumentUri(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("10d331d7", new Object[]{str, str2});
            }
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        public static Uri createDocument(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("283a18f8", new Object[]{contentResolver, uri, str, str2});
            }
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        public static String getTreeDocumentId(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4298a04a", new Object[]{uri});
            }
            return DocumentsContract.getTreeDocumentId(uri);
        }

        public static Uri renameDocument(ContentResolver contentResolver, Uri uri, String str) throws FileNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("83af2130", new Object[]{contentResolver, uri, str});
            }
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DocumentsContractApi24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private DocumentsContractApi24Impl() {
        }

        public static boolean isTreeUri(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("de9d21c0", new Object[]{uri})).booleanValue();
            }
            return DocumentsContract.isTreeUri(uri);
        }

        public static boolean removeDocument(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("edd00d36", new Object[]{contentResolver, uri, uri2})).booleanValue();
            }
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    private DocumentsContractCompat() {
    }

    public static Uri buildChildDocumentsUri(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3b40c954", new Object[]{str, str2});
        }
        return DocumentsContractApi21Impl.buildChildDocumentsUri(str, str2);
    }

    public static Uri buildChildDocumentsUriUsingTree(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("34d3841", new Object[]{uri, str});
        }
        return DocumentsContractApi21Impl.buildChildDocumentsUriUsingTree(uri, str);
    }

    public static Uri buildDocumentUri(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("94f4e355", new Object[]{str, str2});
        }
        return DocumentsContract.buildDocumentUri(str, str2);
    }

    public static Uri buildDocumentUriUsingTree(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("f08bc142", new Object[]{uri, str});
        }
        return DocumentsContractApi21Impl.buildDocumentUriUsingTree(uri, str);
    }

    public static Uri buildTreeDocumentUri(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("10d331d7", new Object[]{str, str2});
        }
        return DocumentsContractApi21Impl.buildTreeDocumentUri(str, str2);
    }

    public static Uri createDocument(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("283a18f8", new Object[]{contentResolver, uri, str, str2});
        }
        return DocumentsContractApi21Impl.createDocument(contentResolver, uri, str, str2);
    }

    public static String getDocumentId(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d3c078c", new Object[]{uri});
        }
        return DocumentsContract.getDocumentId(uri);
    }

    public static String getTreeDocumentId(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4298a04a", new Object[]{uri});
        }
        return DocumentsContractApi21Impl.getTreeDocumentId(uri);
    }

    public static boolean isDocumentUri(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5267f8d1", new Object[]{context, uri})).booleanValue();
        }
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean removeDocument(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edd00d36", new Object[]{contentResolver, uri, uri2})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return DocumentsContractApi24Impl.removeDocument(contentResolver, uri, uri2);
        }
        return DocumentsContract.deleteDocument(contentResolver, uri);
    }

    public static Uri renameDocument(ContentResolver contentResolver, Uri uri, String str) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("83af2130", new Object[]{contentResolver, uri, str});
        }
        return DocumentsContractApi21Impl.renameDocument(contentResolver, uri, str);
    }

    public static boolean isTreeUri(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de9d21c0", new Object[]{uri})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return DocumentsContractApi24Impl.isTreeUri(uri);
        }
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.size() >= 2 && PATH_TREE.equals(pathSegments.get(0));
    }
}
