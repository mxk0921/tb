package com.alibaba.security.wukong.model.multi.file;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.pb;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alibaba.security.wukong.model.multi.file.FileRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class VideoCutFileRiskSample extends FileRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "VideoCutFileRiskSample";
    public final AtomicLong mFileCounter = new AtomicLong(0);
    public List<String> mImageFiles;
    public long sliceIntervalMillis;
    public long startOffsetMillis;

    public VideoCutFileRiskSample(String str, List<String> list, long j, long j2) {
        super(str);
        this.mImageFiles = list;
        this.sliceIntervalMillis = j;
        this.startOffsetMillis = j2;
    }

    public static /* synthetic */ void a(VideoCutFileRiskSample videoCutFileRiskSample, CcrcService ccrcService, FileRiskSample.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde484a7", new Object[]{videoCutFileRiskSample, ccrcService, callback});
        } else {
            videoCutFileRiskSample.a(ccrcService, callback);
        }
    }

    private long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        return (this.mFileCounter.get() * this.sliceIntervalMillis) + this.startOffsetMillis;
    }

    public static /* synthetic */ Object ipc$super(VideoCutFileRiskSample videoCutFileRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/multi/file/VideoCutFileRiskSample");
    }

    @Override // com.alibaba.security.wukong.model.multi.file.FileRiskSample
    public void detect(CcrcService ccrcService, FileRiskSample.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb4a5a9", new Object[]{this, ccrcService, callback});
            return;
        }
        List<String> list = this.mImageFiles;
        if (list == null || list.isEmpty()) {
            if (callback != null) {
                callback.onFileDetectEnd(getSampleId());
            }
            Logging.d(f, "image files is empty");
            return;
        }
        a(new pb(this, ccrcService, callback));
    }

    public List<String> getImageFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2dc8fce", new Object[]{this});
        }
        return this.mImageFiles;
    }

    public long getSliceIntervalMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f51bb62", new Object[]{this})).longValue();
        }
        return this.sliceIntervalMillis;
    }

    public long getStartOffsetMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2764780", new Object[]{this})).longValue();
        }
        return this.startOffsetMillis;
    }

    public void setImageFiles(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198c5056", new Object[]{this, list});
        } else {
            this.mImageFiles = list;
        }
    }

    public void setSliceIntervalMillis(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2f222", new Object[]{this, new Long(j)});
        } else {
            this.sliceIntervalMillis = j;
        }
    }

    public void setStartOffsetMillis(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e96bcc4", new Object[]{this, new Long(j)});
        } else {
            this.startOffsetMillis = j;
        }
    }

    @Override // com.alibaba.security.wukong.model.multi.file.FileRiskSample, com.alibaba.security.wukong.model.multi.MultiModelRiskSample
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "videoFile";
    }

    private void a(CcrcService ccrcService, FileRiskSample.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4f05ab", new Object[]{this, ccrcService, callback});
            return;
        }
        try {
            ListIterator<String> listIterator = this.mImageFiles.listIterator();
            while (listIterator.hasNext()) {
                int nextIndex = listIterator.nextIndex();
                String uuid = UUID.randomUUID().toString();
                Bitmap a2 = a(listIterator.next());
                if (a2 != null) {
                    BitmapImage bitmapImage = new BitmapImage(a2);
                    bitmapImage.getExtras().put("order", Integer.valueOf(nextIndex));
                    bitmapImage.setTs(b());
                    bitmapImage.getExtras().put("endFlag", Boolean.valueOf(!listIterator.hasNext()));
                    getExtras().put("frameCount", Integer.valueOf(this.mImageFiles.size()));
                    BitmapImageSample bitmapImageSample = new BitmapImageSample(uuid, bitmapImage);
                    a(bitmapImageSample);
                    ccrcService.detect(bitmapImageSample, true);
                }
                this.mFileCounter.incrementAndGet();
            }
        } catch (Exception e) {
            Logging.e(f, "detect fail", e);
        }
        if (callback != null) {
            callback.onFileDetectEnd(getSampleId());
        }
    }

    private Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{this, str});
        }
        File file = new File(str);
        if (!file.exists()) {
            Logging.e(f, str + " image not exist");
            return null;
        } else if (file.length() == 0) {
            Logging.e(f, str + " image length 0");
            return null;
        } else {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile == null) {
                Logging.e(f, str + " image load fail");
            }
            return decodeFile;
        }
    }
}
