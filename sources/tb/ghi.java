package tb;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.alibaba.ability.localization.Localization;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.media.MediaBucket;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ghi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Uri QUERY_URI = MediaStore.Files.getContentUri(UiUtil.INPUT_TYPE_VALUE_EXTERNAL);
    public static final String ALL_MEDIA = Localization.q(R.string.gg_pub_all_files);
    public static final String ALL_VIDEO = Localization.q(R.string.gg_pub_all_videos);
    public static final String ALL_IMAGE = Localization.q(R.string.gg_pub_all_photos);

    static {
        t2o.a(519045164);
    }

    public static void a(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b899da42", new Object[]{cursor});
        } else if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static Uri d(Cursor cursor) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("47e2d1b1", new Object[]{cursor});
        }
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("mime_type"));
        if (e(string)) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (!f(string)) {
            return null;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        return ContentUris.withAppendedId(uri, j);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8ab8e26", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return str.startsWith("image");
    }

    public static List<Media> k(Context context, MediaBucket mediaBucket, int i, esc escVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bbcf202a", new Object[]{context, mediaBucket, new Integer(i), escVar});
        }
        return l(context, mediaBucket, i, escVar, true);
    }

    public static List<Media> l(Context context, MediaBucket mediaBucket, int i, esc escVar, boolean z) {
        Cursor cursor;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("67770b70", new Object[]{context, mediaBucket, new Integer(i), escVar, new Boolean(z)});
        }
        if (-1 == mediaBucket.bucketId) {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = QUERY_URI;
            String[] strArr = b.PROJECTION;
            String str3 = c(i) + " AND _size>0";
            if (z) {
                str2 = "date_modified DESC";
            } else {
                str2 = "date_modified";
            }
            cursor = contentResolver.query(uri, strArr, str3, null, str2);
        } else {
            ContentResolver contentResolver2 = context.getContentResolver();
            Uri uri2 = QUERY_URI;
            String[] strArr2 = b.PROJECTION;
            String str4 = c(i) + b.SELECTION;
            String[] strArr3 = {String.valueOf(mediaBucket.bucketId)};
            if (z) {
                str = "date_modified DESC";
            } else {
                str = "date_modified";
            }
            cursor = contentResolver2.query(uri2, strArr2, str4, strArr3, str);
        }
        ArrayList<Media> b2 = b(mediaBucket, escVar, cursor);
        a(cursor);
        return b2;
    }

    public static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce813c2", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "media_type=1";
        }
        if (i == 2) {
            return "media_type=3";
        }
        return "(media_type=1 OR media_type=3)";
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34e1e146", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return str.startsWith("video");
    }

    public static MediaBucket h(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaBucket) ipChange.ipc$dispatch("1d60580e", new Object[]{context, new Integer(i), str});
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.PROJECTION_29, c(i) + " AND _size>0", null, "date_modified DESC");
        MediaBucket mediaBucket = null;
        if (query == null) {
            return null;
        }
        while (query.moveToNext()) {
            if (mediaBucket == null) {
                mediaBucket = new MediaBucket();
                mediaBucket.id = query.getInt(query.getColumnIndex("_id"));
                mediaBucket.bucketId = -1;
                mediaBucket.displayName = str;
                mediaBucket.uri = d(query);
                mediaBucket.mimeType = query.getString(query.getColumnIndex("mime_type"));
                mediaBucket.mediaType = query.getInt(query.getColumnIndex(dov.KEY_MEDIA_TYPE));
                mediaBucket.bucketType = i;
            }
            mediaBucket.count++;
        }
        a(query);
        return mediaBucket;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static final String COLUMN_COUNT = "count";
        public static final String[] PROJECTION = {"_id", "bucket_id", "bucket_display_name", "date_added", "date_modified", "mime_type", dov.KEY_MEDIA_TYPE, "_data", "COUNT(*) AS count"};
        public static final String[] PROJECTION_29 = {"_id", "bucket_id", "bucket_display_name", "date_added", "date_modified", "mime_type", dov.KEY_MEDIA_TYPE, "_data"};
        public static final String SELECTION = " AND _size>0) GROUP BY (bucket_id";
        public static final String SELECTION_29 = " AND _size>0";

        static {
            t2o.a(519045165);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static final String[] PROJECTION = {"_id", "bucket_id", "bucket_display_name", "date_added", "date_modified", "mime_type", dov.KEY_MEDIA_TYPE, "_data", "width", "height", "duration", "_size", "orientation"};
        public static final String SELECTION = " AND bucket_id=? AND _size>0";
        public static final String SELECTION_ALL = " AND _size>0";

        static {
            t2o.a(519045166);
        }
    }

    public static MediaBucket g(Context context, int i, String str) {
        int i2;
        String str2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaBucket) ipChange.ipc$dispatch("97322d30", new Object[]{context, new Integer(i), str});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return h(context, i, str);
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.PROJECTION, c(i) + a.SELECTION, null, "date_modified DESC");
        Uri uri = null;
        if (query == null) {
            return null;
        }
        int i4 = 0;
        while (query.moveToNext()) {
            i4 += query.getInt(query.getColumnIndex("count"));
        }
        if (query.moveToFirst()) {
            i3 = query.getInt(query.getColumnIndex("_id"));
            uri = d(query);
            str2 = query.getString(query.getColumnIndex("mime_type"));
            i2 = query.getInt(query.getColumnIndex(dov.KEY_MEDIA_TYPE));
        } else {
            str2 = "";
            i2 = 1;
        }
        a(query);
        MediaBucket mediaBucket = new MediaBucket();
        mediaBucket.id = i3;
        mediaBucket.bucketId = -1;
        mediaBucket.displayName = str;
        mediaBucket.uri = uri;
        mediaBucket.count = i4;
        mediaBucket.mimeType = str2;
        mediaBucket.mediaType = i2;
        mediaBucket.bucketType = i;
        return mediaBucket;
    }

    public static List<MediaBucket> i(Context context, int i, esc escVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7ae72c", new Object[]{context, new Integer(i), escVar});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return j(context, i, escVar);
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.PROJECTION, c(i) + a.SELECTION, null, "date_modified DESC");
        ArrayList arrayList = new ArrayList();
        if (query != null && query.moveToFirst()) {
            do {
                MediaBucket mediaBucket = new MediaBucket();
                mediaBucket.id = query.getInt(query.getColumnIndex("_id"));
                mediaBucket.bucketId = query.getInt(query.getColumnIndex("bucket_id"));
                mediaBucket.displayName = query.getString(query.getColumnIndex("bucket_display_name"));
                mediaBucket.count = query.getInt(query.getColumnIndex("count"));
                mediaBucket.mimeType = query.getString(query.getColumnIndex("mime_type"));
                mediaBucket.mediaType = query.getInt(query.getColumnIndex(dov.KEY_MEDIA_TYPE));
                mediaBucket.uri = d(query);
                mediaBucket.path = query.getString(query.getColumnIndex("_data"));
                if (escVar != null) {
                    escVar.a(mediaBucket);
                }
                boolean z = escVar != null && escVar.b(mediaBucket);
                if (mediaBucket.uri != null && !z) {
                    arrayList.add(mediaBucket);
                }
            } while (query.moveToNext());
            a(query);
        }
        return arrayList;
    }

    public static List<MediaBucket> j(Context context, int i, esc escVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74e5130a", new Object[]{context, new Integer(i), escVar});
        }
        Cursor query = context.getContentResolver().query(QUERY_URI, a.PROJECTION_29, c(i) + " AND _size>0", null, "date_modified DESC");
        ArrayList arrayList = new ArrayList();
        if (query != null && query.moveToFirst()) {
            HashMap hashMap = new HashMap();
            do {
                int i2 = query.getInt(query.getColumnIndex("bucket_id"));
                MediaBucket mediaBucket = (MediaBucket) hashMap.get(Integer.valueOf(i2));
                if (mediaBucket != null) {
                    mediaBucket.count++;
                } else {
                    MediaBucket mediaBucket2 = new MediaBucket();
                    mediaBucket2.id = query.getInt(query.getColumnIndex("_id"));
                    mediaBucket2.bucketId = query.getInt(query.getColumnIndex("bucket_id"));
                    mediaBucket2.displayName = query.getString(query.getColumnIndex("bucket_display_name"));
                    mediaBucket2.mimeType = query.getString(query.getColumnIndex("mime_type"));
                    mediaBucket2.mediaType = query.getInt(query.getColumnIndex(dov.KEY_MEDIA_TYPE));
                    mediaBucket2.uri = d(query);
                    mediaBucket2.path = query.getString(query.getColumnIndex("_data"));
                    if (escVar != null) {
                        escVar.a(mediaBucket2);
                    }
                    boolean z = escVar != null && escVar.b(mediaBucket2);
                    if (mediaBucket2.uri != null && !z) {
                        arrayList.add(mediaBucket2);
                        hashMap.put(Integer.valueOf(i2), mediaBucket2);
                    }
                    mediaBucket2.count++;
                }
            } while (query.moveToNext());
            a(query);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<Media> b(MediaBucket mediaBucket, esc escVar, Cursor cursor) {
        ImageMedia imageMedia;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d55aa71f", new Object[]{mediaBucket, escVar, cursor});
        }
        ArrayList<Media> arrayList = new ArrayList<>();
        if (!cursor.moveToFirst()) {
            return arrayList;
        }
        do {
            int i = cursor.getInt(cursor.getColumnIndex(dov.KEY_MEDIA_TYPE));
            if (i == 3) {
                VideoMedia videoMedia = new VideoMedia();
                videoMedia.duration = cursor.getLong(cursor.getColumnIndex("duration"));
                imageMedia = videoMedia;
            } else {
                imageMedia = i == 1 ? new ImageMedia() : null;
            }
            imageMedia.id = cursor.getInt(cursor.getColumnIndex("_id"));
            imageMedia.bucketId = cursor.getInt(cursor.getColumnIndex("bucket_id"));
            imageMedia.displayName = cursor.getString(cursor.getColumnIndex("bucket_display_name"));
            imageMedia.mimeType = cursor.getString(cursor.getColumnIndex("mime_type"));
            imageMedia.mediaType = cursor.getInt(cursor.getColumnIndex(dov.KEY_MEDIA_TYPE));
            imageMedia.uri = d(cursor);
            imageMedia.path = cursor.getString(cursor.getColumnIndex("_data"));
            imageMedia.width = cursor.getInt(cursor.getColumnIndex("width"));
            imageMedia.height = cursor.getInt(cursor.getColumnIndex("height"));
            imageMedia.fileSize = cursor.getInt(cursor.getColumnIndex("_size"));
            imageMedia.orientation = cursor.getInt(cursor.getColumnIndex("orientation"));
            imageMedia.dateAddTime = cursor.getLong(cursor.getColumnIndex("date_added"));
            imageMedia.dateModifyTime = cursor.getLong(cursor.getColumnIndex("date_modified"));
            if (escVar != 0) {
                escVar.a(mediaBucket);
            }
            boolean z = escVar != 0 && escVar.b(imageMedia);
            if (imageMedia.uri != null && !z) {
                arrayList.add(imageMedia);
            }
        } while (cursor.moveToNext());
        return arrayList;
    }
}
