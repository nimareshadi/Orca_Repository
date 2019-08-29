package com.nimi.orcamicroserver.EnLanguage;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "en_table", schema = "orca_shema", catalog = "")
public class EnTableEntity {
    private int id;
    private String key;
    private String content;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "key", nullable = false, length = 60)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 250)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnTableEntity that = (EnTableEntity) o;
        return id == that.id &&
                Objects.equals(key, that.key) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, content);
    }
}
