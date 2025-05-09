package com.taobao.android.litecreator.uikit.album.datasource;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.media.MediaBucket;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import tb.esc;
import tb.ghi;
import tb.odg;
import tb.t2o;
import tb.xxp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommonASCDataSource extends xxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashSet<String> DEFAULT_SUPPORTED_MIME_TYPE_SET = new HashSet<String>() { // from class: com.taobao.android.litecreator.uikit.album.datasource.CommonASCDataSource.1
        {
            add("image/jpg");
            add(Constants.SHARETYPE_WITH_QRCODE);
            add("image/jpeg");
            add("image/heic");
            add("image/heif");
        }
    };
    public static List<MediaBucket> m;
    public static List<Media> n;
    public final MediaBucket g;
    public int h;
    public final HashMap<String, HashSet<String>> i;
    public String j;
    public boolean k;
    public a l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<Media> f8324a;
        public boolean b;

        static {
            t2o.a(511705579);
        }

        public synchronized List<Media> a(Context context, MediaBucket mediaBucket, esc escVar) {
            List<Media> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a347b9fa", new Object[]{this, context, mediaBucket, escVar});
            }
            List<Media> list2 = this.f8324a;
            if (list2 != null && list2.size() > 0) {
                return this.f8324a;
            }
            if (mediaBucket.bucketId == -1 && (list = CommonASCDataSource.n) != null && list.size() > 0) {
                return CommonASCDataSource.n;
            }
            this.f8324a = ghi.l(context, mediaBucket, 0, escVar, this.b);
            return this.f8324a;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19299a73", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    static {
        t2o.a(511705577);
    }

    public CommonASCDataSource(MediaBucket mediaBucket) {
        this(mediaBucket, 0);
    }

    public static /* synthetic */ Object ipc$super(CommonASCDataSource commonASCDataSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/uikit/album/datasource/CommonASCDataSource");
    }

    @Override // tb.xxp, com.taobao.android.mediapick.b
    public List<Media> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9cbd685b", new Object[]{this});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List<Media> o = o();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        odg.d("LCAlbumPresenter.sql query cost=" + elapsedRealtime2, new Object[0]);
        return o;
    }

    @Override // com.taobao.android.mediapick.b
    public boolean i(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c558b", new Object[]{this, media})).booleanValue();
        }
        if (!(media instanceof ImageMedia)) {
            return false;
        }
        return q(media);
    }

    public HashSet<String> n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("2b11464a", new Object[]{this, str});
        }
        return DEFAULT_SUPPORTED_MIME_TYPE_SET;
    }

    public final List<Media> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("597be052", new Object[]{this});
        }
        try {
            a aVar = this.l;
            if (aVar == null) {
                return ghi.l(c(), this.g, f(), e(), false);
            }
            aVar.b(false);
            return this.l.a(c(), this.g, e());
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public boolean p(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afbddf2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (i <= i2 || i >= i3) {
            return false;
        }
        return true;
    }

    public boolean q(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e0d93e", new Object[]{this, media})).booleanValue();
        }
        ImageMedia imageMedia = (ImageMedia) media;
        if (p(imageMedia.width, 0, this.h) || p(imageMedia.height, 0, this.h) || TextUtils.isEmpty(imageMedia.mimeType) || !n(this.j).contains(imageMedia.mimeType.toLowerCase())) {
            return true;
        }
        return false;
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c31f", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ff1f44", new Object[]{this, aVar});
        } else {
            this.l = aVar;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871612e5", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public CommonASCDataSource(MediaBucket mediaBucket, int i) {
        super(mediaBucket, i);
        this.i = new HashMap<>();
        this.j = "common";
        this.g = mediaBucket;
    }
}
