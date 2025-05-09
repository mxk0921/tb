package tb;

import android.os.Build;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SharedMemory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.utils.ReflectUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mlp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f24124a;

    static {
        t2o.a(393216104);
    }

    public static byte[] a(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d863a406", new Object[]{parcelable});
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcelable;
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            while (channel.read(allocate) != -1) {
                byteArrayOutputStream.write(allocate.array());
                allocate.clear();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            fileInputStream.close();
            parcelFileDescriptor.close();
            return byteArray;
        } catch (Exception e) {
            throw new RuntimeException("big data decode error", e);
        }
    }

    public static Parcelable b(byte[] bArr) {
        SharedMemory create;
        ByteBuffer mapReadWrite;
        try {
            String uuid = UUID.randomUUID().toString();
            if (Build.VERSION.SDK_INT <= 26) {
                if (f24124a == null) {
                    f24124a = ReflectUtils.getHideMethod(MemoryFile.class, Constants.GET_FILE_DESCRIPTOR, new Class[0]);
                }
                MemoryFile memoryFile = new MemoryFile(uuid, bArr.length);
                memoryFile.writeBytes(bArr, 0, 0, bArr.length);
                return ParcelFileDescriptor.dup((FileDescriptor) f24124a.invoke(memoryFile, new Object[0]));
            }
            if (f24124a == null) {
                f24124a = ReflectUtils.getHideMethod(llp.a(), Constants.GET_FILE_DESCRIPTOR, new Class[0]);
            }
            create = SharedMemory.create(uuid, bArr.length);
            mapReadWrite = create.mapReadWrite();
            mapReadWrite.put(bArr, 0, bArr.length);
            return ParcelFileDescriptor.dup((FileDescriptor) f24124a.invoke(create, new Object[0]));
        } catch (Exception e) {
            throw new RuntimeException("big data encode error", e);
        }
    }
}
