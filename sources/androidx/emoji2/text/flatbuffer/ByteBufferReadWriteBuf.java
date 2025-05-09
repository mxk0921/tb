package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ByteBufferReadWriteBuf implements ReadWriteBuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ByteBuffer buffer;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e78157cc", new Object[]{this});
        }
        return this.buffer.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15b2", new Object[]{this, new Integer(i)})).byteValue();
        }
        return this.buffer.get(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2037feae", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (get(i) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769404e3", new Object[]{this, new Integer(i)})).doubleValue();
        }
        return this.buffer.getDouble(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aecf2e66", new Object[]{this, new Integer(i)})).floatValue();
        }
        return this.buffer.getFloat(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab0c236", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.buffer.getInt(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43ad79e", new Object[]{this, new Integer(i)})).longValue();
        }
        return this.buffer.getLong(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48c22053", new Object[]{this, new Integer(i)})).shortValue();
        }
        return this.buffer.getShort(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97d36d72", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return Utf8Safe.decodeUtf8Buffer(this.buffer, i, i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67e67ab5", new Object[]{this})).intValue();
        }
        return this.buffer.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861ddc7d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else {
            this.buffer.put(bArr, i, i2);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cb94b4", new Object[]{this, new Boolean(z)});
        } else {
            this.buffer.put(z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9070d7", new Object[]{this, new Double(d)});
        } else {
            this.buffer.putDouble(d);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c84b3ac", new Object[]{this, new Float(f)});
        } else {
            this.buffer.putFloat(f);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b521cfc", new Object[]{this, new Integer(i)});
        } else {
            this.buffer.putInt(i);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c4d7d2", new Object[]{this, new Long(j)});
        } else {
            this.buffer.putLong(j);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2677d659", new Object[]{this, new Short(s)});
        } else {
            this.buffer.putShort(s);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a56c97", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i <= this.buffer.limit()) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbc2fc2", new Object[]{this, new Integer(i), new Byte(b)});
            return;
        }
        requestCapacity(1 + i);
        this.buffer.put(i, b);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799eefde", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            set(i, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9235f4f5", new Object[]{this, new Integer(i), new Double(d)});
            return;
        }
        requestCapacity(i + 8);
        this.buffer.putDouble(i, d);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17c7b7e", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        requestCapacity(i + 4);
        this.buffer.putFloat(i, f);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17bbb994", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        requestCapacity(i + 4);
        this.buffer.putInt(i, i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b144e266", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        requestCapacity(i + 8);
        this.buffer.putLong(i, j);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e7f66b", new Object[]{this, new Integer(i), new Short(s)});
            return;
        }
        requestCapacity(2 + i);
        this.buffer.putShort(i, s);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4adb36a2", new Object[]{this})).intValue();
        }
        return this.buffer.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684a4366", new Object[]{this, new Byte(b)});
        } else {
            this.buffer.put(b);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787e42a1", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3)});
            return;
        }
        requestCapacity((i3 - i2) + i);
        int position = this.buffer.position();
        this.buffer.position(i);
        this.buffer.put(bArr, i2, i3);
        this.buffer.position(position);
    }
}
